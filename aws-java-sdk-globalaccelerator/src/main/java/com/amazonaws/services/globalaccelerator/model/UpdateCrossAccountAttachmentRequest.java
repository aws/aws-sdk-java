/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCrossAccountAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCrossAccountAttachmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment to update.
     * </p>
     */
    private String attachmentArn;
    /**
     * <p>
     * The name of the cross-account attachment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The principals to add to the cross-account attachment. A principal is an account or the Amazon Resource Name
     * (ARN) of an accelerator that the attachment gives permission to work with resources from another account. The
     * resources are also listed in the attachment.
     * </p>
     * <p>
     * To add more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * </p>
     */
    private java.util.List<String> addPrincipals;
    /**
     * <p>
     * The principals to remove from the cross-account attachment. A principal is an account or the Amazon Resource Name
     * (ARN) of an accelerator that the attachment gives permission to work with resources from another account. The
     * resources are also listed in the attachment.
     * </p>
     * <p>
     * To remove more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * </p>
     */
    private java.util.List<String> removePrincipals;
    /**
     * <p>
     * The resources to add to the cross-account attachment. A resource listed in a cross-account attachment can be used
     * with an accelerator by the principals that are listed in the attachment.
     * </p>
     * <p>
     * To add more than one resource, separate the resource ARNs with commas.
     * </p>
     */
    private java.util.List<Resource> addResources;
    /**
     * <p>
     * The resources to remove from the cross-account attachment. A resource listed in a cross-account attachment can be
     * used with an accelerator by the principals that are listed in the attachment.
     * </p>
     * <p>
     * To remove more than one resource, separate the resource ARNs with commas.
     * </p>
     */
    private java.util.List<Resource> removeResources;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment to update.
     * </p>
     * 
     * @param attachmentArn
     *        The Amazon Resource Name (ARN) of the cross-account attachment to update.
     */

    public void setAttachmentArn(String attachmentArn) {
        this.attachmentArn = attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cross-account attachment to update.
     */

    public String getAttachmentArn() {
        return this.attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment to update.
     * </p>
     * 
     * @param attachmentArn
     *        The Amazon Resource Name (ARN) of the cross-account attachment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrossAccountAttachmentRequest withAttachmentArn(String attachmentArn) {
        setAttachmentArn(attachmentArn);
        return this;
    }

    /**
     * <p>
     * The name of the cross-account attachment.
     * </p>
     * 
     * @param name
     *        The name of the cross-account attachment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cross-account attachment.
     * </p>
     * 
     * @return The name of the cross-account attachment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cross-account attachment.
     * </p>
     * 
     * @param name
     *        The name of the cross-account attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrossAccountAttachmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The principals to add to the cross-account attachment. A principal is an account or the Amazon Resource Name
     * (ARN) of an accelerator that the attachment gives permission to work with resources from another account. The
     * resources are also listed in the attachment.
     * </p>
     * <p>
     * To add more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * </p>
     * 
     * @return The principals to add to the cross-account attachment. A principal is an account or the Amazon Resource
     *         Name (ARN) of an accelerator that the attachment gives permission to work with resources from another
     *         account. The resources are also listed in the attachment.</p>
     *         <p>
     *         To add more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     */

    public java.util.List<String> getAddPrincipals() {
        return addPrincipals;
    }

    /**
     * <p>
     * The principals to add to the cross-account attachment. A principal is an account or the Amazon Resource Name
     * (ARN) of an accelerator that the attachment gives permission to work with resources from another account. The
     * resources are also listed in the attachment.
     * </p>
     * <p>
     * To add more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * </p>
     * 
     * @param addPrincipals
     *        The principals to add to the cross-account attachment. A principal is an account or the Amazon Resource
     *        Name (ARN) of an accelerator that the attachment gives permission to work with resources from another
     *        account. The resources are also listed in the attachment.</p>
     *        <p>
     *        To add more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     */

    public void setAddPrincipals(java.util.Collection<String> addPrincipals) {
        if (addPrincipals == null) {
            this.addPrincipals = null;
            return;
        }

        this.addPrincipals = new java.util.ArrayList<String>(addPrincipals);
    }

    /**
     * <p>
     * The principals to add to the cross-account attachment. A principal is an account or the Amazon Resource Name
     * (ARN) of an accelerator that the attachment gives permission to work with resources from another account. The
     * resources are also listed in the attachment.
     * </p>
     * <p>
     * To add more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddPrincipals(java.util.Collection)} or {@link #withAddPrincipals(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param addPrincipals
     *        The principals to add to the cross-account attachment. A principal is an account or the Amazon Resource
     *        Name (ARN) of an accelerator that the attachment gives permission to work with resources from another
     *        account. The resources are also listed in the attachment.</p>
     *        <p>
     *        To add more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrossAccountAttachmentRequest withAddPrincipals(String... addPrincipals) {
        if (this.addPrincipals == null) {
            setAddPrincipals(new java.util.ArrayList<String>(addPrincipals.length));
        }
        for (String ele : addPrincipals) {
            this.addPrincipals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The principals to add to the cross-account attachment. A principal is an account or the Amazon Resource Name
     * (ARN) of an accelerator that the attachment gives permission to work with resources from another account. The
     * resources are also listed in the attachment.
     * </p>
     * <p>
     * To add more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * </p>
     * 
     * @param addPrincipals
     *        The principals to add to the cross-account attachment. A principal is an account or the Amazon Resource
     *        Name (ARN) of an accelerator that the attachment gives permission to work with resources from another
     *        account. The resources are also listed in the attachment.</p>
     *        <p>
     *        To add more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrossAccountAttachmentRequest withAddPrincipals(java.util.Collection<String> addPrincipals) {
        setAddPrincipals(addPrincipals);
        return this;
    }

    /**
     * <p>
     * The principals to remove from the cross-account attachment. A principal is an account or the Amazon Resource Name
     * (ARN) of an accelerator that the attachment gives permission to work with resources from another account. The
     * resources are also listed in the attachment.
     * </p>
     * <p>
     * To remove more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * </p>
     * 
     * @return The principals to remove from the cross-account attachment. A principal is an account or the Amazon
     *         Resource Name (ARN) of an accelerator that the attachment gives permission to work with resources from
     *         another account. The resources are also listed in the attachment.</p>
     *         <p>
     *         To remove more than one principal, separate the account numbers or accelerator ARNs, or both, with
     *         commas.
     */

    public java.util.List<String> getRemovePrincipals() {
        return removePrincipals;
    }

    /**
     * <p>
     * The principals to remove from the cross-account attachment. A principal is an account or the Amazon Resource Name
     * (ARN) of an accelerator that the attachment gives permission to work with resources from another account. The
     * resources are also listed in the attachment.
     * </p>
     * <p>
     * To remove more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * </p>
     * 
     * @param removePrincipals
     *        The principals to remove from the cross-account attachment. A principal is an account or the Amazon
     *        Resource Name (ARN) of an accelerator that the attachment gives permission to work with resources from
     *        another account. The resources are also listed in the attachment.</p>
     *        <p>
     *        To remove more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     */

    public void setRemovePrincipals(java.util.Collection<String> removePrincipals) {
        if (removePrincipals == null) {
            this.removePrincipals = null;
            return;
        }

        this.removePrincipals = new java.util.ArrayList<String>(removePrincipals);
    }

    /**
     * <p>
     * The principals to remove from the cross-account attachment. A principal is an account or the Amazon Resource Name
     * (ARN) of an accelerator that the attachment gives permission to work with resources from another account. The
     * resources are also listed in the attachment.
     * </p>
     * <p>
     * To remove more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemovePrincipals(java.util.Collection)} or {@link #withRemovePrincipals(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param removePrincipals
     *        The principals to remove from the cross-account attachment. A principal is an account or the Amazon
     *        Resource Name (ARN) of an accelerator that the attachment gives permission to work with resources from
     *        another account. The resources are also listed in the attachment.</p>
     *        <p>
     *        To remove more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrossAccountAttachmentRequest withRemovePrincipals(String... removePrincipals) {
        if (this.removePrincipals == null) {
            setRemovePrincipals(new java.util.ArrayList<String>(removePrincipals.length));
        }
        for (String ele : removePrincipals) {
            this.removePrincipals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The principals to remove from the cross-account attachment. A principal is an account or the Amazon Resource Name
     * (ARN) of an accelerator that the attachment gives permission to work with resources from another account. The
     * resources are also listed in the attachment.
     * </p>
     * <p>
     * To remove more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * </p>
     * 
     * @param removePrincipals
     *        The principals to remove from the cross-account attachment. A principal is an account or the Amazon
     *        Resource Name (ARN) of an accelerator that the attachment gives permission to work with resources from
     *        another account. The resources are also listed in the attachment.</p>
     *        <p>
     *        To remove more than one principal, separate the account numbers or accelerator ARNs, or both, with commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrossAccountAttachmentRequest withRemovePrincipals(java.util.Collection<String> removePrincipals) {
        setRemovePrincipals(removePrincipals);
        return this;
    }

    /**
     * <p>
     * The resources to add to the cross-account attachment. A resource listed in a cross-account attachment can be used
     * with an accelerator by the principals that are listed in the attachment.
     * </p>
     * <p>
     * To add more than one resource, separate the resource ARNs with commas.
     * </p>
     * 
     * @return The resources to add to the cross-account attachment. A resource listed in a cross-account attachment can
     *         be used with an accelerator by the principals that are listed in the attachment.</p>
     *         <p>
     *         To add more than one resource, separate the resource ARNs with commas.
     */

    public java.util.List<Resource> getAddResources() {
        return addResources;
    }

    /**
     * <p>
     * The resources to add to the cross-account attachment. A resource listed in a cross-account attachment can be used
     * with an accelerator by the principals that are listed in the attachment.
     * </p>
     * <p>
     * To add more than one resource, separate the resource ARNs with commas.
     * </p>
     * 
     * @param addResources
     *        The resources to add to the cross-account attachment. A resource listed in a cross-account attachment can
     *        be used with an accelerator by the principals that are listed in the attachment.</p>
     *        <p>
     *        To add more than one resource, separate the resource ARNs with commas.
     */

    public void setAddResources(java.util.Collection<Resource> addResources) {
        if (addResources == null) {
            this.addResources = null;
            return;
        }

        this.addResources = new java.util.ArrayList<Resource>(addResources);
    }

    /**
     * <p>
     * The resources to add to the cross-account attachment. A resource listed in a cross-account attachment can be used
     * with an accelerator by the principals that are listed in the attachment.
     * </p>
     * <p>
     * To add more than one resource, separate the resource ARNs with commas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddResources(java.util.Collection)} or {@link #withAddResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addResources
     *        The resources to add to the cross-account attachment. A resource listed in a cross-account attachment can
     *        be used with an accelerator by the principals that are listed in the attachment.</p>
     *        <p>
     *        To add more than one resource, separate the resource ARNs with commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrossAccountAttachmentRequest withAddResources(Resource... addResources) {
        if (this.addResources == null) {
            setAddResources(new java.util.ArrayList<Resource>(addResources.length));
        }
        for (Resource ele : addResources) {
            this.addResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources to add to the cross-account attachment. A resource listed in a cross-account attachment can be used
     * with an accelerator by the principals that are listed in the attachment.
     * </p>
     * <p>
     * To add more than one resource, separate the resource ARNs with commas.
     * </p>
     * 
     * @param addResources
     *        The resources to add to the cross-account attachment. A resource listed in a cross-account attachment can
     *        be used with an accelerator by the principals that are listed in the attachment.</p>
     *        <p>
     *        To add more than one resource, separate the resource ARNs with commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrossAccountAttachmentRequest withAddResources(java.util.Collection<Resource> addResources) {
        setAddResources(addResources);
        return this;
    }

    /**
     * <p>
     * The resources to remove from the cross-account attachment. A resource listed in a cross-account attachment can be
     * used with an accelerator by the principals that are listed in the attachment.
     * </p>
     * <p>
     * To remove more than one resource, separate the resource ARNs with commas.
     * </p>
     * 
     * @return The resources to remove from the cross-account attachment. A resource listed in a cross-account
     *         attachment can be used with an accelerator by the principals that are listed in the attachment.</p>
     *         <p>
     *         To remove more than one resource, separate the resource ARNs with commas.
     */

    public java.util.List<Resource> getRemoveResources() {
        return removeResources;
    }

    /**
     * <p>
     * The resources to remove from the cross-account attachment. A resource listed in a cross-account attachment can be
     * used with an accelerator by the principals that are listed in the attachment.
     * </p>
     * <p>
     * To remove more than one resource, separate the resource ARNs with commas.
     * </p>
     * 
     * @param removeResources
     *        The resources to remove from the cross-account attachment. A resource listed in a cross-account attachment
     *        can be used with an accelerator by the principals that are listed in the attachment.</p>
     *        <p>
     *        To remove more than one resource, separate the resource ARNs with commas.
     */

    public void setRemoveResources(java.util.Collection<Resource> removeResources) {
        if (removeResources == null) {
            this.removeResources = null;
            return;
        }

        this.removeResources = new java.util.ArrayList<Resource>(removeResources);
    }

    /**
     * <p>
     * The resources to remove from the cross-account attachment. A resource listed in a cross-account attachment can be
     * used with an accelerator by the principals that are listed in the attachment.
     * </p>
     * <p>
     * To remove more than one resource, separate the resource ARNs with commas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveResources(java.util.Collection)} or {@link #withRemoveResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param removeResources
     *        The resources to remove from the cross-account attachment. A resource listed in a cross-account attachment
     *        can be used with an accelerator by the principals that are listed in the attachment.</p>
     *        <p>
     *        To remove more than one resource, separate the resource ARNs with commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrossAccountAttachmentRequest withRemoveResources(Resource... removeResources) {
        if (this.removeResources == null) {
            setRemoveResources(new java.util.ArrayList<Resource>(removeResources.length));
        }
        for (Resource ele : removeResources) {
            this.removeResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources to remove from the cross-account attachment. A resource listed in a cross-account attachment can be
     * used with an accelerator by the principals that are listed in the attachment.
     * </p>
     * <p>
     * To remove more than one resource, separate the resource ARNs with commas.
     * </p>
     * 
     * @param removeResources
     *        The resources to remove from the cross-account attachment. A resource listed in a cross-account attachment
     *        can be used with an accelerator by the principals that are listed in the attachment.</p>
     *        <p>
     *        To remove more than one resource, separate the resource ARNs with commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrossAccountAttachmentRequest withRemoveResources(java.util.Collection<Resource> removeResources) {
        setRemoveResources(removeResources);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttachmentArn() != null)
            sb.append("AttachmentArn: ").append(getAttachmentArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAddPrincipals() != null)
            sb.append("AddPrincipals: ").append(getAddPrincipals()).append(",");
        if (getRemovePrincipals() != null)
            sb.append("RemovePrincipals: ").append(getRemovePrincipals()).append(",");
        if (getAddResources() != null)
            sb.append("AddResources: ").append(getAddResources()).append(",");
        if (getRemoveResources() != null)
            sb.append("RemoveResources: ").append(getRemoveResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCrossAccountAttachmentRequest == false)
            return false;
        UpdateCrossAccountAttachmentRequest other = (UpdateCrossAccountAttachmentRequest) obj;
        if (other.getAttachmentArn() == null ^ this.getAttachmentArn() == null)
            return false;
        if (other.getAttachmentArn() != null && other.getAttachmentArn().equals(this.getAttachmentArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAddPrincipals() == null ^ this.getAddPrincipals() == null)
            return false;
        if (other.getAddPrincipals() != null && other.getAddPrincipals().equals(this.getAddPrincipals()) == false)
            return false;
        if (other.getRemovePrincipals() == null ^ this.getRemovePrincipals() == null)
            return false;
        if (other.getRemovePrincipals() != null && other.getRemovePrincipals().equals(this.getRemovePrincipals()) == false)
            return false;
        if (other.getAddResources() == null ^ this.getAddResources() == null)
            return false;
        if (other.getAddResources() != null && other.getAddResources().equals(this.getAddResources()) == false)
            return false;
        if (other.getRemoveResources() == null ^ this.getRemoveResources() == null)
            return false;
        if (other.getRemoveResources() != null && other.getRemoveResources().equals(this.getRemoveResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentArn() == null) ? 0 : getAttachmentArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAddPrincipals() == null) ? 0 : getAddPrincipals().hashCode());
        hashCode = prime * hashCode + ((getRemovePrincipals() == null) ? 0 : getRemovePrincipals().hashCode());
        hashCode = prime * hashCode + ((getAddResources() == null) ? 0 : getAddResources().hashCode());
        hashCode = prime * hashCode + ((getRemoveResources() == null) ? 0 : getRemoveResources().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCrossAccountAttachmentRequest clone() {
        return (UpdateCrossAccountAttachmentRequest) super.clone();
    }

}
