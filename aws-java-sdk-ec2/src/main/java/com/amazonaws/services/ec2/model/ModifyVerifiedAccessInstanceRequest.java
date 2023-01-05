/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVerifiedAccessInstanceRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVerifiedAccessInstanceRequest> {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     */
    private String verifiedAccessInstanceId;
    /**
     * <p>
     * A description for the Amazon Web Services Verified Access instance.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstanceId
     *        The ID of the Amazon Web Services Verified Access instance.
     */

    public void setVerifiedAccessInstanceId(String verifiedAccessInstanceId) {
        this.verifiedAccessInstanceId = verifiedAccessInstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access instance.
     */

    public String getVerifiedAccessInstanceId() {
        return this.verifiedAccessInstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstanceId
     *        The ID of the Amazon Web Services Verified Access instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessInstanceRequest withVerifiedAccessInstanceId(String verifiedAccessInstanceId) {
        setVerifiedAccessInstanceId(verifiedAccessInstanceId);
        return this;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access instance.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @return A description for the Amazon Web Services Verified Access instance.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessInstanceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessInstanceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVerifiedAccessInstanceRequest> getDryRunRequest() {
        Request<ModifyVerifiedAccessInstanceRequest> request = new ModifyVerifiedAccessInstanceRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVerifiedAccessInstanceId() != null)
            sb.append("VerifiedAccessInstanceId: ").append(getVerifiedAccessInstanceId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVerifiedAccessInstanceRequest == false)
            return false;
        ModifyVerifiedAccessInstanceRequest other = (ModifyVerifiedAccessInstanceRequest) obj;
        if (other.getVerifiedAccessInstanceId() == null ^ this.getVerifiedAccessInstanceId() == null)
            return false;
        if (other.getVerifiedAccessInstanceId() != null && other.getVerifiedAccessInstanceId().equals(this.getVerifiedAccessInstanceId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessInstanceId() == null) ? 0 : getVerifiedAccessInstanceId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVerifiedAccessInstanceRequest clone() {
        return (ModifyVerifiedAccessInstanceRequest) super.clone();
    }
}
