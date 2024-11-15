/**
 * Copyright (c) 2023, 2024 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.syson.sysml.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.syson.sysml.Namespace;
import org.eclipse.syson.sysml.NamespaceImport;
import org.eclipse.syson.sysml.SysmlPackage;
import org.eclipse.syson.sysml.VisibilityKind;

/**
 * This is the item provider adapter for a {@link org.eclipse.syson.sysml.NamespaceImport} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class NamespaceImportItemProvider extends ImportItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NamespaceImportItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addImportedNamespacePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Imported Namespace feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addImportedNamespacePropertyDescriptor(Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                this.getResourceLocator(),
                this.getString("_UI_NamespaceImport_importedNamespace_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_NamespaceImport_importedNamespace_feature", "_UI_NamespaceImport_type"),
                SysmlPackage.eINSTANCE.getNamespaceImport_ImportedNamespace(),
                true,
                false,
                true,
                null,
                null,
                null));
    }

    /**
     * This returns NamespaceImport.svg. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public Object getImage(Object object) {
        String imagePath = "full/obj16/NamespaceImport.svg";
        boolean isRecursive = ((NamespaceImport) object).isIsRecursive();
        if (isRecursive) {
            imagePath = "full/obj16/NamespaceImportRecursive.svg";
        }
        return this.overlayImage(object, this.getResourceLocator().getImage(imagePath));
    }

    /**
     * {@inheritDoc}.
     *
     * @generated NOT
     */
    @Override
    protected Object overlayImage(Object object, Object image) {
        var result = image;
        Object superResult = super.overlayImage(object, image);
        if (object instanceof NamespaceImport namespaceImport) {
            List<Object> images = new ArrayList<>(2);
            images.add(image);
            if (superResult != null && superResult != result) {
                images.add(superResult);
            }
            if (namespaceImport.getVisibility() == VisibilityKind.PRIVATE) {
                images.add(this.getResourceLocator().getImage("full/ovr16/VisibilityKind_private.svg"));
            } else if (namespaceImport.getVisibility() == VisibilityKind.PROTECTED) {
                images.add(this.getResourceLocator().getImage("full/ovr16/VisibilityKind_protected.svg"));
            }
            result = new ComposedImage(images);
        }
        return result;
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        Namespace importedNamespace = ((NamespaceImport) object).getImportedNamespace();
        if (importedNamespace != null) {
            StringBuilder text = new StringBuilder();
            text.append("import ");
            text.append(importedNamespace.getQualifiedName());
            if (((NamespaceImport) object).isIsRecursive()) {
                text.append("::**");
            } else {
                text.append("::*");
            }
            return text.toString();
        }
        String label = ((NamespaceImport) object).getName();
        return label == null || label.length() == 0 ? this.getString("_UI_NamespaceImport_type") : this.getString("_UI_NamespaceImport_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
     * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        this.updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created
     * under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == SysmlPackage.eINSTANCE.getElement_OwnedRelationship() ||
                childFeature == SysmlPackage.eINSTANCE.getRelationship_OwnedRelatedElement();

        if (qualify) {
            return this.getString("_UI_CreateChild_text2",
                    new Object[] { this.getTypeText(childObject), this.getFeatureText(childFeature), this.getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
