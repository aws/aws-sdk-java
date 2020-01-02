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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRemediationExceptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRemediationExceptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AWS Config rule for which you want to delete remediation exception configuration.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception
     * for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RemediationExceptionResourceKey> resourceKeys;

    /**
     * <p>
     * The name of the AWS Config rule for which you want to delete remediation exception configuration.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule for which you want to delete remediation exception configuration.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule for which you want to delete remediation exception configuration.
     * </p>
     * 
     * @return The name of the AWS Config rule for which you want to delete remediation exception configuration.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule for which you want to delete remediation exception configuration.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule for which you want to delete remediation exception configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRemediationExceptionsRequest withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception
     * for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys.
     * </p>
     * 
     * @return An exception list of resource exception keys to be processed with the current request. AWS Config adds
     *         exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys.
     */

    public java.util.List<RemediationExceptionResourceKey> getResourceKeys() {
        if (resourceKeys == null) {
            resourceKeys = new com.amazonaws.internal.SdkInternalList<RemediationExceptionResourceKey>();
        }
        return resourceKeys;
    }

    /**
     * <p>
     * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception
     * for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys.
     * </p>
     * 
     * @param resourceKeys
     *        An exception list of resource exception keys to be processed with the current request. AWS Config adds
     *        exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys.
     */

    public void setResourceKeys(java.util.Collection<RemediationExceptionResourceKey> resourceKeys) {
        if (resourceKeys == null) {
            this.resourceKeys = null;
            return;
        }

        this.resourceKeys = new com.amazonaws.internal.SdkInternalList<RemediationExceptionResourceKey>(resourceKeys);
    }

    /**
     * <p>
     * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception
     * for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceKeys(java.util.Collection)} or {@link #withResourceKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceKeys
     *        An exception list of resource exception keys to be processed with the current request. AWS Config adds
     *        exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRemediationExceptionsRequest withResourceKeys(RemediationExceptionResourceKey... resourceKeys) {
        if (this.resourceKeys == null) {
            setResourceKeys(new com.amazonaws.internal.SdkInternalList<RemediationExceptionResourceKey>(resourceKeys.length));
        }
        for (RemediationExceptionResourceKey ele : resourceKeys) {
            this.resourceKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception
     * for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys.
     * </p>
     * 
     * @param resourceKeys
     *        An exception list of resource exception keys to be processed with the current request. AWS Config adds
     *        exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRemediationExceptionsRequest withResourceKeys(java.util.Collection<RemediationExceptionResourceKey> resourceKeys) {
        setResourceKeys(resourceKeys);
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
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
        if (getResourceKeys() != null)
            sb.append("ResourceKeys: ").append(getResourceKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRemediationExceptionsRequest == false)
            return false;
        DeleteRemediationExceptionsRequest other = (DeleteRemediationExceptionsRequest) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getResourceKeys() == null ^ this.getResourceKeys() == null)
            return false;
        if (other.getResourceKeys() != null && other.getResourceKeys().equals(this.getResourceKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getResourceKeys() == null) ? 0 : getResourceKeys().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRemediationExceptionsRequest clone() {
        return (DeleteRemediationExceptionsRequest) super.clone();
    }

}
