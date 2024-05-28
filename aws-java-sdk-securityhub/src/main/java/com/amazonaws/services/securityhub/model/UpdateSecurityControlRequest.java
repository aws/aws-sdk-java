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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityControl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or ID of the control to update.
     * </p>
     */
    private String securityControlId;
    /**
     * <p>
     * An object that specifies which security control parameters to update.
     * </p>
     */
    private java.util.Map<String, ParameterConfiguration> parameters;
    /**
     * <p>
     * The most recent reason for updating the properties of the security control. This field accepts alphanumeric
     * characters in addition to white spaces, dashes, and underscores.
     * </p>
     */
    private String lastUpdateReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or ID of the control to update.
     * </p>
     * 
     * @param securityControlId
     *        The Amazon Resource Name (ARN) or ID of the control to update.
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or ID of the control to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or ID of the control to update.
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or ID of the control to update.
     * </p>
     * 
     * @param securityControlId
     *        The Amazon Resource Name (ARN) or ID of the control to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityControlRequest withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
        return this;
    }

    /**
     * <p>
     * An object that specifies which security control parameters to update.
     * </p>
     * 
     * @return An object that specifies which security control parameters to update.
     */

    public java.util.Map<String, ParameterConfiguration> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * An object that specifies which security control parameters to update.
     * </p>
     * 
     * @param parameters
     *        An object that specifies which security control parameters to update.
     */

    public void setParameters(java.util.Map<String, ParameterConfiguration> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * An object that specifies which security control parameters to update.
     * </p>
     * 
     * @param parameters
     *        An object that specifies which security control parameters to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityControlRequest withParameters(java.util.Map<String, ParameterConfiguration> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see UpdateSecurityControlRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityControlRequest addParametersEntry(String key, ParameterConfiguration value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, ParameterConfiguration>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityControlRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The most recent reason for updating the properties of the security control. This field accepts alphanumeric
     * characters in addition to white spaces, dashes, and underscores.
     * </p>
     * 
     * @param lastUpdateReason
     *        The most recent reason for updating the properties of the security control. This field accepts
     *        alphanumeric characters in addition to white spaces, dashes, and underscores.
     */

    public void setLastUpdateReason(String lastUpdateReason) {
        this.lastUpdateReason = lastUpdateReason;
    }

    /**
     * <p>
     * The most recent reason for updating the properties of the security control. This field accepts alphanumeric
     * characters in addition to white spaces, dashes, and underscores.
     * </p>
     * 
     * @return The most recent reason for updating the properties of the security control. This field accepts
     *         alphanumeric characters in addition to white spaces, dashes, and underscores.
     */

    public String getLastUpdateReason() {
        return this.lastUpdateReason;
    }

    /**
     * <p>
     * The most recent reason for updating the properties of the security control. This field accepts alphanumeric
     * characters in addition to white spaces, dashes, and underscores.
     * </p>
     * 
     * @param lastUpdateReason
     *        The most recent reason for updating the properties of the security control. This field accepts
     *        alphanumeric characters in addition to white spaces, dashes, and underscores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityControlRequest withLastUpdateReason(String lastUpdateReason) {
        setLastUpdateReason(lastUpdateReason);
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
        if (getSecurityControlId() != null)
            sb.append("SecurityControlId: ").append(getSecurityControlId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getLastUpdateReason() != null)
            sb.append("LastUpdateReason: ").append(getLastUpdateReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityControlRequest == false)
            return false;
        UpdateSecurityControlRequest other = (UpdateSecurityControlRequest) obj;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getLastUpdateReason() == null ^ this.getLastUpdateReason() == null)
            return false;
        if (other.getLastUpdateReason() != null && other.getLastUpdateReason().equals(this.getLastUpdateReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateReason() == null) ? 0 : getLastUpdateReason().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecurityControlRequest clone() {
        return (UpdateSecurityControlRequest) super.clone();
    }

}
