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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteIdentityPropagationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIdentityPropagationConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that you want to delete an identity propagation configuration from.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The name of the Amazon Web Services service that you want to delete the associated access scopes and authorized
     * targets from.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The ID of the Amazon Web Services account that you want to delete an identity propagation configuration from.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that you want to delete an identity propagation configuration
     *        from.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that you want to delete an identity propagation configuration from.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that you want to delete an identity propagation configuration
     *         from.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that you want to delete an identity propagation configuration from.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that you want to delete an identity propagation configuration
     *        from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIdentityPropagationConfigRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service that you want to delete the associated access scopes and authorized
     * targets from.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Services service that you want to delete the associated access scopes and
     *        authorized targets from.
     * @see ServiceType
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service that you want to delete the associated access scopes and authorized
     * targets from.
     * </p>
     * 
     * @return The name of the Amazon Web Services service that you want to delete the associated access scopes and
     *         authorized targets from.
     * @see ServiceType
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service that you want to delete the associated access scopes and authorized
     * targets from.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Services service that you want to delete the associated access scopes and
     *        authorized targets from.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public DeleteIdentityPropagationConfigRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service that you want to delete the associated access scopes and authorized
     * targets from.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Services service that you want to delete the associated access scopes and
     *        authorized targets from.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public DeleteIdentityPropagationConfigRequest withService(ServiceType service) {
        this.service = service.toString();
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
        if (getService() != null)
            sb.append("Service: ").append(getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIdentityPropagationConfigRequest == false)
            return false;
        DeleteIdentityPropagationConfigRequest other = (DeleteIdentityPropagationConfigRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIdentityPropagationConfigRequest clone() {
        return (DeleteIdentityPropagationConfigRequest) super.clone();
    }

}
