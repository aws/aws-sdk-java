/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateNamespace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the AWS account that you want to create the QuickSight namespace in.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The name that you want to use to describe the new namespace.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * Specifies the type of your user identity directory. Currently, this supports users with an identity type of
     * <code>QUICKSIGHT</code>.
     * </p>
     */
    private String identityStore;
    /**
     * <p>
     * The tags that you want to associate with the namespace that you're creating.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID for the AWS account that you want to create the QuickSight namespace in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to create the QuickSight namespace in.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to create the QuickSight namespace in.
     * </p>
     * 
     * @return The ID for the AWS account that you want to create the QuickSight namespace in.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to create the QuickSight namespace in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to create the QuickSight namespace in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamespaceRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The name that you want to use to describe the new namespace.
     * </p>
     * 
     * @param namespace
     *        The name that you want to use to describe the new namespace.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The name that you want to use to describe the new namespace.
     * </p>
     * 
     * @return The name that you want to use to describe the new namespace.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The name that you want to use to describe the new namespace.
     * </p>
     * 
     * @param namespace
     *        The name that you want to use to describe the new namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamespaceRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * Specifies the type of your user identity directory. Currently, this supports users with an identity type of
     * <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @param identityStore
     *        Specifies the type of your user identity directory. Currently, this supports users with an identity type
     *        of <code>QUICKSIGHT</code>.
     * @see IdentityStore
     */

    public void setIdentityStore(String identityStore) {
        this.identityStore = identityStore;
    }

    /**
     * <p>
     * Specifies the type of your user identity directory. Currently, this supports users with an identity type of
     * <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @return Specifies the type of your user identity directory. Currently, this supports users with an identity type
     *         of <code>QUICKSIGHT</code>.
     * @see IdentityStore
     */

    public String getIdentityStore() {
        return this.identityStore;
    }

    /**
     * <p>
     * Specifies the type of your user identity directory. Currently, this supports users with an identity type of
     * <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @param identityStore
     *        Specifies the type of your user identity directory. Currently, this supports users with an identity type
     *        of <code>QUICKSIGHT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityStore
     */

    public CreateNamespaceRequest withIdentityStore(String identityStore) {
        setIdentityStore(identityStore);
        return this;
    }

    /**
     * <p>
     * Specifies the type of your user identity directory. Currently, this supports users with an identity type of
     * <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @param identityStore
     *        Specifies the type of your user identity directory. Currently, this supports users with an identity type
     *        of <code>QUICKSIGHT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityStore
     */

    public CreateNamespaceRequest withIdentityStore(IdentityStore identityStore) {
        this.identityStore = identityStore.toString();
        return this;
    }

    /**
     * <p>
     * The tags that you want to associate with the namespace that you're creating.
     * </p>
     * 
     * @return The tags that you want to associate with the namespace that you're creating.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that you want to associate with the namespace that you're creating.
     * </p>
     * 
     * @param tags
     *        The tags that you want to associate with the namespace that you're creating.
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
     * The tags that you want to associate with the namespace that you're creating.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags that you want to associate with the namespace that you're creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamespaceRequest withTags(Tag... tags) {
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
     * The tags that you want to associate with the namespace that you're creating.
     * </p>
     * 
     * @param tags
     *        The tags that you want to associate with the namespace that you're creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamespaceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getIdentityStore() != null)
            sb.append("IdentityStore: ").append(getIdentityStore()).append(",");
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

        if (obj instanceof CreateNamespaceRequest == false)
            return false;
        CreateNamespaceRequest other = (CreateNamespaceRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getIdentityStore() == null ^ this.getIdentityStore() == null)
            return false;
        if (other.getIdentityStore() != null && other.getIdentityStore().equals(this.getIdentityStore()) == false)
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

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getIdentityStore() == null) ? 0 : getIdentityStore().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateNamespaceRequest clone() {
        return (CreateNamespaceRequest) super.clone();
    }

}
