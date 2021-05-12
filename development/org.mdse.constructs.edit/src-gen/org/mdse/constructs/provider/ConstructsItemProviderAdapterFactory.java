/**
 */
package org.mdse.constructs.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.mdse.constructs.util.ConstructsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstructsItemProviderAdapterFactory extends ConstructsAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.IntegerVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerVariableItemProvider integerVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.IntegerVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerVariableAdapter() {
		if (integerVariableItemProvider == null) {
			integerVariableItemProvider = new IntegerVariableItemProvider(this);
		}

		return integerVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.StringVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringVariableItemProvider stringVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.StringVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringVariableAdapter() {
		if (stringVariableItemProvider == null) {
			stringVariableItemProvider = new StringVariableItemProvider(this);
		}

		return stringVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.BooleanVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanVariableItemProvider booleanVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.BooleanVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanVariableAdapter() {
		if (booleanVariableItemProvider == null) {
			booleanVariableItemProvider = new BooleanVariableItemProvider(this);
		}

		return booleanVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.ComparativeExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparativeExpressionItemProvider comparativeExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.ComparativeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComparativeExpressionAdapter() {
		if (comparativeExpressionItemProvider == null) {
			comparativeExpressionItemProvider = new ComparativeExpressionItemProvider(this);
		}

		return comparativeExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.ArithmeticExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticExpressionItemProvider arithmeticExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.ArithmeticExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArithmeticExpressionAdapter() {
		if (arithmeticExpressionItemProvider == null) {
			arithmeticExpressionItemProvider = new ArithmeticExpressionItemProvider(this);
		}

		return arithmeticExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.IfElseStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfElseStatementItemProvider ifElseStatementItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.IfElseStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfElseStatementAdapter() {
		if (ifElseStatementItemProvider == null) {
			ifElseStatementItemProvider = new IfElseStatementItemProvider(this);
		}

		return ifElseStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.DeclareStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareStatementItemProvider declareStatementItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.DeclareStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclareStatementAdapter() {
		if (declareStatementItemProvider == null) {
			declareStatementItemProvider = new DeclareStatementItemProvider(this);
		}

		return declareStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.ReturnStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnStatementItemProvider returnStatementItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.ReturnStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReturnStatementAdapter() {
		if (returnStatementItemProvider == null) {
			returnStatementItemProvider = new ReturnStatementItemProvider(this);
		}

		return returnStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.IntergerLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntergerLiteralItemProvider intergerLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.IntergerLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntergerLiteralAdapter() {
		if (intergerLiteralItemProvider == null) {
			intergerLiteralItemProvider = new IntergerLiteralItemProvider(this);
		}

		return intergerLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.StringLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralItemProvider stringLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.StringLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringLiteralAdapter() {
		if (stringLiteralItemProvider == null) {
			stringLiteralItemProvider = new StringLiteralItemProvider(this);
		}

		return stringLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.BooleanLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralItemProvider booleanLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.BooleanLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanLiteralAdapter() {
		if (booleanLiteralItemProvider == null) {
			booleanLiteralItemProvider = new BooleanLiteralItemProvider(this);
		}

		return booleanLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.constructs.SetStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetStatementItemProvider setStatementItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.constructs.SetStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetStatementAdapter() {
		if (setStatementItemProvider == null) {
			setStatementItemProvider = new SetStatementItemProvider(this);
		}

		return setStatementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (integerVariableItemProvider != null)
			integerVariableItemProvider.dispose();
		if (stringVariableItemProvider != null)
			stringVariableItemProvider.dispose();
		if (booleanVariableItemProvider != null)
			booleanVariableItemProvider.dispose();
		if (comparativeExpressionItemProvider != null)
			comparativeExpressionItemProvider.dispose();
		if (arithmeticExpressionItemProvider != null)
			arithmeticExpressionItemProvider.dispose();
		if (ifElseStatementItemProvider != null)
			ifElseStatementItemProvider.dispose();
		if (declareStatementItemProvider != null)
			declareStatementItemProvider.dispose();
		if (returnStatementItemProvider != null)
			returnStatementItemProvider.dispose();
		if (intergerLiteralItemProvider != null)
			intergerLiteralItemProvider.dispose();
		if (stringLiteralItemProvider != null)
			stringLiteralItemProvider.dispose();
		if (booleanLiteralItemProvider != null)
			booleanLiteralItemProvider.dispose();
		if (setStatementItemProvider != null)
			setStatementItemProvider.dispose();
	}

}
