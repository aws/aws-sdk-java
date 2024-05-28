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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCrossAccountAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCrossAccountAttachmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cross-account attachment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The principals to include in the cross-account attachment. A principal can be an Amazon Web Services account
     * number or the Amazon Resource Name (ARN) for an accelerator.
     * </p>
     */
    private java.util.List<String> principals;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the resources to include in the cross-account attachment. A resource can be
     * any supported Amazon Web Services resource type for Global Accelerator or a CIDR range for a bring your own IP
     * address (BYOIP) address pool.
     * </p>
     */
    private java.util.List<Resource> resources;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * Add tags for a cross-account attachment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in
     * Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateCrossAccountAttachmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The principals to include in the cross-account attachment. A principal can be an Amazon Web Services account
     * number or the Amazon Resource Name (ARN) for an accelerator.
     * </p>
     * 
     * @return The principals to include in the cross-account attachment. A principal can be an Amazon Web Services
     *         account number or the Amazon Resource Name (ARN) for an accelerator.
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * The principals to include in the cross-account attachment. A principal can be an Amazon Web Services account
     * number or the Amazon Resource Name (ARN) for an accelerator.
     * </p>
     * 
     * @param principals
     *        The principals to include in the cross-account attachment. A principal can be an Amazon Web Services
     *        account number or the Amazon Resource Name (ARN) for an accelerator.
     */

    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * The principals to include in the cross-account attachment. A principal can be an Amazon Web Services account
     * number or the Amazon Resource Name (ARN) for an accelerator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        The principals to include in the cross-account attachment. A principal can be an Amazon Web Services
     *        account number or the Amazon Resource Name (ARN) for an accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrossAccountAttachmentRequest withPrincipals(String... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<String>(principals.length));
        }
        for (String ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The principals to include in the cross-account attachment. A principal can be an Amazon Web Services account
     * number or the Amazon Resource Name (ARN) for an accelerator.
     * </p>
     * 
     * @param principals
     *        The principals to include in the cross-account attachment. A principal can be an Amazon Web Services
     *        account number or the Amazon Resource Name (ARN) for an accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrossAccountAttachmentRequest withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the resources to include in the cross-account attachment. A resource can be
     * any supported Amazon Web Services resource type for Global Accelerator or a CIDR range for a bring your own IP
     * address (BYOIP) address pool.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) for the resources to include in the cross-account attachment. A resource
     *         can be any supported Amazon Web Services resource type for Global Accelerator or a CIDR range for a bring
     *         your own IP address (BYOIP) address pool.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the resources to include in the cross-account attachment. A resource can be
     * any supported Amazon Web Services resource type for Global Accelerator or a CIDR range for a bring your own IP
     * address (BYOIP) address pool.
     * </p>
     * 
     * @param resources
     *        The Amazon Resource Names (ARNs) for the resources to include in the cross-account attachment. A resource
     *        can be any supported Amazon Web Services resource type for Global Accelerator or a CIDR range for a bring
     *        your own IP address (BYOIP) address pool.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the resources to include in the cross-account attachment. A resource can be
     * any supported Amazon Web Services resource type for Global Accelerator or a CIDR range for a bring your own IP
     * address (BYOIP) address pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The Amazon Resource Names (ARNs) for the resources to include in the cross-account attachment. A resource
     *        can be any supported Amazon Web Services resource type for Global Accelerator or a CIDR range for a bring
     *        your own IP address (BYOIP) address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrossAccountAttachmentRequest withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the resources to include in the cross-account attachment. A resource can be
     * any supported Amazon Web Services resource type for Global Accelerator or a CIDR range for a bring your own IP
     * address (BYOIP) address pool.
     * </p>
     * 
     * @param resources
     *        The Amazon Resource Names (ARNs) for the resources to include in the cross-account attachment. A resource
     *        can be any supported Amazon Web Services resource type for Global Accelerator or a CIDR range for a bring
     *        your own IP address (BYOIP) address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrossAccountAttachmentRequest withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of
     *        the request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of
     *         the request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrossAccountAttachmentRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * Add tags for a cross-account attachment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in
     * Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @return Add tags for a cross-account attachment.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html"
     *         >Tagging in Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Add tags for a cross-account attachment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in
     * Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        Add tags for a cross-account attachment.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging
     *        in Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Add tags for a cross-account attachment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in
     * Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Add tags for a cross-account attachment.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging
     *        in Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrossAccountAttachmentRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Add tags for a cross-account attachment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in
     * Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        Add tags for a cross-account attachment.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging
     *        in Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrossAccountAttachmentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCrossAccountAttachmentRequest == false)
            return false;
        CreateCrossAccountAttachmentRequest other = (CreateCrossAccountAttachmentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCrossAccountAttachmentRequest clone() {
        return (CreateCrossAccountAttachmentRequest) super.clone();
    }

}
