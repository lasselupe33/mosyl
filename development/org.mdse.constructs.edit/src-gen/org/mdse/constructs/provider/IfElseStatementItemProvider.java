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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mdse.constructs.ConstructsFactory;
import org.mdse.constructs.ConstructsPackage;
import org.mdse.constructs.IfElseStatement;

/**
 * This is the item provider adapter for a {@link org.mdse.constructs.IfElseStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfElseStatementItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfElseStatementItemProvider(AdapterFactory adapterFactory) {
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

			addConditionPropertyDescriptor(object);
			addStatement2PropertyDescriptor(object);
			addStatement1PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IfElseStatement_condition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IfElseStatement_condition_feature",
								"_UI_IfElseStatement_type"),
						ConstructsPackage.Literals.IF_ELSE_STATEMENT__CONDITION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Statement2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatement2PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IfElseStatement_statement2_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IfElseStatement_statement2_feature",
								"_UI_IfElseStatement_type"),
						ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT2, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Statement1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatement1PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IfElseStatement_statement1_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IfElseStatement_statement1_feature",
								"_UI_IfElseStatement_type"),
						ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT1, true, false, true, null, null, null));
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
			childrenFeatures.add(ConstructsPackage.Literals.IF_ELSE_STATEMENT__CONDITION);
			childrenFeatures.add(ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT2);
			childrenFeatures.add(ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT1);
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
	 * This returns IfElseStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfElseStatement"));
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
		return getString("_UI_IfElseStatement_type");
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

		switch (notification.getFeatureID(IfElseStatement.class)) {
		case ConstructsPackage.IF_ELSE_STATEMENT__CONDITION:
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT2:
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT1:
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

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__CONDITION,
				ConstructsFactory.eINSTANCE.createIntegerVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__CONDITION,
				ConstructsFactory.eINSTANCE.createStringVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__CONDITION,
				ConstructsFactory.eINSTANCE.createBooleanVariable()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__CONDITION,
				ConstructsFactory.eINSTANCE.createComparativeExpression()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__CONDITION,
				ConstructsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT2,
				ConstructsFactory.eINSTANCE.createIfElseStatement()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT2,
				ConstructsFactory.eINSTANCE.createDeclareStatement()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT2,
				ConstructsFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT1,
				ConstructsFactory.eINSTANCE.createIfElseStatement()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT1,
				ConstructsFactory.eINSTANCE.createDeclareStatement()));

		newChildDescriptors.add(createChildParameter(ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT1,
				ConstructsFactory.eINSTANCE.createReturnStatement()));
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

		boolean qualify = childFeature == ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT2
				|| childFeature == ConstructsPackage.Literals.IF_ELSE_STATEMENT__STATEMENT1;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
