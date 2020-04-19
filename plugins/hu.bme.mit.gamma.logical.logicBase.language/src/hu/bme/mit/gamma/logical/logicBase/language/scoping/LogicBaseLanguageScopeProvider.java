/*
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.gamma.logical.logicBase.language.scoping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;

import hu.bme.mit.gamma.logical.logicBase.model.Event;
import hu.bme.mit.gamma.logical.logicBase.model.LogicInterfaceSpecification;
import hu.bme.mit.gamma.logical.logicBase.model.LogicalDiagram;
import hu.bme.mit.gamma.logical.logicBase.model.ModelPackage;
import hu.bme.mit.gamma.logical.logicBase.model.Predicate;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class LogicBaseLanguageScopeProvider extends AbstractLogicBaseLanguageScopeProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * <br><br> If a model element context refers to {@link Event}(s) using rule QualifiedName, and 
	 * context is transitively contained by a {@link LogicalDiagram}, then 
	 * this function properly handles references to the event(s) of the 
	 * first containing {@link LogicalDiagram} using the qualified name 
	 * of the {@link Event}(s)  (interfaceName.eventName).
	 */
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if(reference.getEReferenceType() == ModelPackage.Literals.EVENT) {
			Optional<IScope> foundScope = EventReferenceScope.scopeFor(context);
			
			if(foundScope.isPresent()) {
				return foundScope.get();
			}
		}

		return super.getScope(context, reference);
	}
	
	private static class EventReferenceScope {
		/**
		 * @exception NullPointerException Iff obj is null.
		 */
		public static Optional<IScope> scopeFor(EObject obj) {
			Optional<LogicalDiagram> diagramRequestResult = diagramOf(obj);
			return diagramRequestResult.map(EventReferenceScope::getEventDescriptionsScope);
		}
		
		
		
		private static IScope getEventDescriptionsScope(LogicalDiagram diagram) {
			return new SimpleScope(eventsWithQualifiedNameOf(diagram));
		}
		
		/**
		 * @exception NullPointerException Iff diagram is null.
		 */
		private static List<IEObjectDescription> eventsWithQualifiedNameOf(LogicalDiagram diagram){
			List<IEObjectDescription> possibleEvents = new ArrayList<>();
			
			for(LogicInterfaceSpecification i : diagram.getInterfaces()) {
				for(Event e : i.getEvents()) {
					possibleEvents.add(eventWithQualifiedNameOf(e, i));
				}
			}
			
			return possibleEvents;
		}
		
		/**
		 * The function assumes without checking that parentInterface has event event.
		 * @exception NullPointerException Iff any of the arguemnts is null.
		 */
		private static IEObjectDescription eventWithQualifiedNameOf(Event event, LogicInterfaceSpecification parentInterface) {
			QualifiedName qualifiedName = QualifiedName.create(parentInterface.getName(), event.getName());
			return EObjectDescription.create(qualifiedName, event);
		}
		
		/**
		 * @exception NullPointerException Iff object is null.
		 */
		private static Optional<LogicalDiagram> diagramOf(EObject object) {
			return closestTransitiveContainerMatching(
						object,
						EventReferenceScope::isLogicalDiagram
					).map(eobj->(LogicalDiagram)eobj);
		}
		
		private static boolean isLogicalDiagram(EObject object) {
			return object instanceof LogicalDiagram;
		}
		
		/**
		 * @exception NullPointerException Iff any of the arguments is null.
		 */
		private static Optional<EObject> closestTransitiveContainerMatching(EObject object, java.util.function.Predicate<EObject> pred) {
			while(!(pred.test(object))) {
				
				if(object.eContainer() == null) {
					return Optional.empty();
				}
				else {
					object = object.eContainer();
				}
			}
			
			return Optional.of(object);
		}
	}
	
}
