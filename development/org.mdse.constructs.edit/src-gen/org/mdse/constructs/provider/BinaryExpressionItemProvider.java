/**
 */
package org.mdse.constructs.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mdse.constructs.BinaryExpression;
import org.mdse.constructs.ConstructsFactory;
import org.mdse.constructs.ConstructsPackage;

/**
 * This is the item provider adapter for a {@link org.mdse.constructs.BinaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION1);
			childrenFeatures.add(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION2);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BinaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryExpression"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BinaryExpression_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BinaryExpression.class)) {
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION1:
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION2:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createIntegerVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createStringVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createBooleanVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createComparativeExpression()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createIntegerVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createStringVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createBooleanVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createComparativeExpression()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createBooleanLiteral()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION1
				|| childFeature == ConstructsPackage.Literals.BINARY_EXPRESSION__EXPRESSION2;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
