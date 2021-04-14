/**
 */
package org.mdse.constructs.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mdse.constructs.ComparativeExpression;
import org.mdse.constructs.ComparativeOperator;
import org.mdse.constructs.ConstructsFactory;
import org.mdse.constructs.ConstructsPackage;

/**
 * This is the item provider adapter for a {@link org.mdse.constructs.ComparativeExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparativeExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparativeExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addOperatorPropertyDescriptor(object);
			addExpression2PropertyDescriptor(object);
			addExpression1PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComparativeExpression_operator_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComparativeExpression_operator_feature",
						"_UI_ComparativeExpression_type"),
				ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__OPERATOR, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expression2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpression2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComparativeExpression_expression2_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComparativeExpression_expression2_feature",
						"_UI_ComparativeExpression_type"),
				ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Expression1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpression1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComparativeExpression_expression1_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComparativeExpression_expression1_feature",
						"_UI_ComparativeExpression_type"),
				ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1, true, false, true, null, null, null));
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
			childrenFeatures.add(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2);
			childrenFeatures.add(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1);
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
	 * This returns ComparativeExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComparativeExpression"));
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
		ComparativeOperator labelValue = ((ComparativeExpression) object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_ComparativeExpression_type")
				: getString("_UI_ComparativeExpression_type") + " " + label;
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

		switch (notification.getFeatureID(ComparativeExpression.class)) {
		case ConstructsPackage.COMPARATIVE_EXPRESSION__OPERATOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ConstructsPackage.COMPARATIVE_EXPRESSION__EXPRESSION2:
		case ConstructsPackage.COMPARATIVE_EXPRESSION__EXPRESSION1:
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

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createIntegerVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createStringVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createBooleanVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createComparativeExpression()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2,
				ConstructsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createIntegerVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createStringVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createBooleanVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createComparativeExpression()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1,
				ConstructsFactory.eINSTANCE.createArithmeticExpression()));
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

		boolean qualify = childFeature == ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2
				|| childFeature == ConstructsPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
