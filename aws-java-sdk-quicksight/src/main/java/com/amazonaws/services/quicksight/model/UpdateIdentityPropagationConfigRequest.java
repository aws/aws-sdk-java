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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIdentityPropagationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIdentityPropagationConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the identity propagation configuration that you want to
     * update.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The name of the Amazon Web Services service that contains the authorized targets that you want to add or update.
     * </p>
     */
    private String service;
    /**
     * <p>
     * Specifies a list of application ARNs that represent the authorized targets for a service.
     * </p>
     */
    private java.util.List<String> authorizedTargets;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the identity propagation configuration that you want to
     * update.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the identity propagation configuration that you
     *        want to update.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the identity propagation configuration that you want to
     * update.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the identity propagation configuration that you
     *         want to update.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the identity propagation configuration that you want to
     * update.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the identity propagation configuration that you
     *        want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityPropagationConfigRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service that contains the authorized targets that you want to add or update.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Services service that contains the authorized targets that you want to add or
     *        update.
     * @see ServiceType
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service that contains the authorized targets that you want to add or update.
     * </p>
     * 
     * @return The name of the Amazon Web Services service that contains the authorized targets that you want to add or
     *         update.
     * @see ServiceType
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service that contains the authorized targets that you want to add or update.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Services service that contains the authorized targets that you want to add or
     *        update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public UpdateIdentityPropagationConfigRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service that contains the authorized targets that you want to add or update.
     * </p>
     * 
     * @param service
     *        The name of the Amazon Web Services service that contains the authorized targets that you want to add or
     *        update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public UpdateIdentityPropagationConfigRequest withService(ServiceType service) {
        this.service = service.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a list of application ARNs that represent the authorized targets for a service.
     * </p>
     * 
     * @return Specifies a list of application ARNs that represent the authorized targets for a service.
     */

    public java.util.List<String> getAuthorizedTargets() {
        return authorizedTargets;
    }

    /**
     * <p>
     * Specifies a list of application ARNs that represent the authorized targets for a service.
     * </p>
     * 
     * @param authorizedTargets
     *        Specifies a list of application ARNs that represent the authorized targets for a service.
     */

    public void setAuthorizedTargets(java.util.Collection<String> authorizedTargets) {
        if (authorizedTargets == null) {
            this.authorizedTargets = null;
            return;
        }

        this.authorizedTargets = new java.util.ArrayList<String>(authorizedTargets);
    }

    /**
     * <p>
     * Specifies a list of application ARNs that represent the authorized targets for a service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedTargets(java.util.Collection)} or {@link #withAuthorizedTargets(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param authorizedTargets
     *        Specifies a list of application ARNs that represent the authorized targets for a service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityPropagationConfigRequest withAuthorizedTargets(String... authorizedTargets) {
        if (this.authorizedTargets == null) {
            setAuthorizedTargets(new java.util.ArrayList<String>(authorizedTargets.length));
        }
        for (String ele : authorizedTargets) {
            this.authorizedTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of application ARNs that represent the authorized targets for a service.
     * </p>
     * 
     * @param authorizedTargets
     *        Specifies a list of application ARNs that represent the authorized targets for a service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityPropagationConfigRequest withAuthorizedTargets(java.util.Collection<String> authorizedTargets) {
        setAuthorizedTargets(authorizedTargets);
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
            sb.append("Service: ").append(getService()).append(",");
        if (getAuthorizedTargets() != null)
            sb.append("AuthorizedTargets: ").append(getAuthorizedTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIdentityPropagationConfigRequest == false)
            return false;
        UpdateIdentityPropagationConfigRequest other = (UpdateIdentityPropagationConfigRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getAuthorizedTargets() == null ^ this.getAuthorizedTargets() == null)
            return false;
        if (other.getAuthorizedTargets() != null && other.getAuthorizedTargets().equals(this.getAuthorizedTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedTargets() == null) ? 0 : getAuthorizedTargets().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIdentityPropagationConfigRequest clone() {
        return (UpdateIdentityPropagationConfigRequest) super.clone();
    }

}
