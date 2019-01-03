/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a DeleteCustomActionType operation. The custom action will be marked as deleted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeleteCustomActionType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomActionTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The category of the custom action that you want to delete, such as source or deploy.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The provider of the service used in the custom action, such as AWS CodeDeploy.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The version of the custom action to delete.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The category of the custom action that you want to delete, such as source or deploy.
     * </p>
     * 
     * @param category
     *        The category of the custom action that you want to delete, such as source or deploy.
     * @see ActionCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the custom action that you want to delete, such as source or deploy.
     * </p>
     * 
     * @return The category of the custom action that you want to delete, such as source or deploy.
     * @see ActionCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of the custom action that you want to delete, such as source or deploy.
     * </p>
     * 
     * @param category
     *        The category of the custom action that you want to delete, such as source or deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionCategory
     */

    public DeleteCustomActionTypeRequest withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of the custom action that you want to delete, such as source or deploy.
     * </p>
     * 
     * @param category
     *        The category of the custom action that you want to delete, such as source or deploy.
     * @see ActionCategory
     */

    public void setCategory(ActionCategory category) {
        withCategory(category);
    }

    /**
     * <p>
     * The category of the custom action that you want to delete, such as source or deploy.
     * </p>
     * 
     * @param category
     *        The category of the custom action that you want to delete, such as source or deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionCategory
     */

    public DeleteCustomActionTypeRequest withCategory(ActionCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The provider of the service used in the custom action, such as AWS CodeDeploy.
     * </p>
     * 
     * @param provider
     *        The provider of the service used in the custom action, such as AWS CodeDeploy.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the service used in the custom action, such as AWS CodeDeploy.
     * </p>
     * 
     * @return The provider of the service used in the custom action, such as AWS CodeDeploy.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the service used in the custom action, such as AWS CodeDeploy.
     * </p>
     * 
     * @param provider
     *        The provider of the service used in the custom action, such as AWS CodeDeploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomActionTypeRequest withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The version of the custom action to delete.
     * </p>
     * 
     * @param version
     *        The version of the custom action to delete.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the custom action to delete.
     * </p>
     * 
     * @return The version of the custom action to delete.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the custom action to delete.
     * </p>
     * 
     * @param version
     *        The version of the custom action to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomActionTypeRequest withVersion(String version) {
        setVersion(version);
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomActionTypeRequest == false)
            return false;
        DeleteCustomActionTypeRequest other = (DeleteCustomActionTypeRequest) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomActionTypeRequest clone() {
        return (DeleteCustomActionTypeRequest) super.clone();
    }

}
