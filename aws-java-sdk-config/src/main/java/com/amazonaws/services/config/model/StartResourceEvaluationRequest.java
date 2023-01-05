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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartResourceEvaluation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartResourceEvaluationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a <code>ResourceDetails</code> object.
     * </p>
     */
    private ResourceDetails resourceDetails;
    /**
     * <p>
     * Returns an <code>EvaluationContext</code> object.
     * </p>
     */
    private EvaluationContext evaluationContext;
    /**
     * <p>
     * The mode of an evaluation. The valid value for this API is <code>Proactive</code>.
     * </p>
     */
    private String evaluationMode;
    /**
     * <p>
     * The timeout for an evaluation. The default is 900 seconds. You cannot specify a number greater than 3600. If you
     * specify 0, Config uses the default.
     * </p>
     */
    private Integer evaluationTimeout;
    /**
     * <p>
     * A client token is a unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request
     * using one of these actions, specify a client token in the request.
     * </p>
     * <note>
     * <p>
     * Avoid reusing the same client token for other API requests. If you retry a request that completed successfully
     * using the same client token and the same parameters, the retry succeeds without performing any further actions.
     * If you retry a successful request using the same client token, but one or more of the parameters are different,
     * other than the Region or Availability Zone, the retry fails with an IdempotentParameterMismatch error.
     * </p>
     * </note>
     */
    private String clientToken;

    /**
     * <p>
     * Returns a <code>ResourceDetails</code> object.
     * </p>
     * 
     * @param resourceDetails
     *        Returns a <code>ResourceDetails</code> object.
     */

    public void setResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * Returns a <code>ResourceDetails</code> object.
     * </p>
     * 
     * @return Returns a <code>ResourceDetails</code> object.
     */

    public ResourceDetails getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * <p>
     * Returns a <code>ResourceDetails</code> object.
     * </p>
     * 
     * @param resourceDetails
     *        Returns a <code>ResourceDetails</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceEvaluationRequest withResourceDetails(ResourceDetails resourceDetails) {
        setResourceDetails(resourceDetails);
        return this;
    }

    /**
     * <p>
     * Returns an <code>EvaluationContext</code> object.
     * </p>
     * 
     * @param evaluationContext
     *        Returns an <code>EvaluationContext</code> object.
     */

    public void setEvaluationContext(EvaluationContext evaluationContext) {
        this.evaluationContext = evaluationContext;
    }

    /**
     * <p>
     * Returns an <code>EvaluationContext</code> object.
     * </p>
     * 
     * @return Returns an <code>EvaluationContext</code> object.
     */

    public EvaluationContext getEvaluationContext() {
        return this.evaluationContext;
    }

    /**
     * <p>
     * Returns an <code>EvaluationContext</code> object.
     * </p>
     * 
     * @param evaluationContext
     *        Returns an <code>EvaluationContext</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceEvaluationRequest withEvaluationContext(EvaluationContext evaluationContext) {
        setEvaluationContext(evaluationContext);
        return this;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid value for this API is <code>Proactive</code>.
     * </p>
     * 
     * @param evaluationMode
     *        The mode of an evaluation. The valid value for this API is <code>Proactive</code>.
     * @see EvaluationMode
     */

    public void setEvaluationMode(String evaluationMode) {
        this.evaluationMode = evaluationMode;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid value for this API is <code>Proactive</code>.
     * </p>
     * 
     * @return The mode of an evaluation. The valid value for this API is <code>Proactive</code>.
     * @see EvaluationMode
     */

    public String getEvaluationMode() {
        return this.evaluationMode;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid value for this API is <code>Proactive</code>.
     * </p>
     * 
     * @param evaluationMode
     *        The mode of an evaluation. The valid value for this API is <code>Proactive</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public StartResourceEvaluationRequest withEvaluationMode(String evaluationMode) {
        setEvaluationMode(evaluationMode);
        return this;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid value for this API is <code>Proactive</code>.
     * </p>
     * 
     * @param evaluationMode
     *        The mode of an evaluation. The valid value for this API is <code>Proactive</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public StartResourceEvaluationRequest withEvaluationMode(EvaluationMode evaluationMode) {
        this.evaluationMode = evaluationMode.toString();
        return this;
    }

    /**
     * <p>
     * The timeout for an evaluation. The default is 900 seconds. You cannot specify a number greater than 3600. If you
     * specify 0, Config uses the default.
     * </p>
     * 
     * @param evaluationTimeout
     *        The timeout for an evaluation. The default is 900 seconds. You cannot specify a number greater than 3600.
     *        If you specify 0, Config uses the default.
     */

    public void setEvaluationTimeout(Integer evaluationTimeout) {
        this.evaluationTimeout = evaluationTimeout;
    }

    /**
     * <p>
     * The timeout for an evaluation. The default is 900 seconds. You cannot specify a number greater than 3600. If you
     * specify 0, Config uses the default.
     * </p>
     * 
     * @return The timeout for an evaluation. The default is 900 seconds. You cannot specify a number greater than 3600.
     *         If you specify 0, Config uses the default.
     */

    public Integer getEvaluationTimeout() {
        return this.evaluationTimeout;
    }

    /**
     * <p>
     * The timeout for an evaluation. The default is 900 seconds. You cannot specify a number greater than 3600. If you
     * specify 0, Config uses the default.
     * </p>
     * 
     * @param evaluationTimeout
     *        The timeout for an evaluation. The default is 900 seconds. You cannot specify a number greater than 3600.
     *        If you specify 0, Config uses the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceEvaluationRequest withEvaluationTimeout(Integer evaluationTimeout) {
        setEvaluationTimeout(evaluationTimeout);
        return this;
    }

    /**
     * <p>
     * A client token is a unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request
     * using one of these actions, specify a client token in the request.
     * </p>
     * <note>
     * <p>
     * Avoid reusing the same client token for other API requests. If you retry a request that completed successfully
     * using the same client token and the same parameters, the retry succeeds without performing any further actions.
     * If you retry a successful request using the same client token, but one or more of the parameters are different,
     * other than the Region or Availability Zone, the retry fails with an IdempotentParameterMismatch error.
     * </p>
     * </note>
     * 
     * @param clientToken
     *        A client token is a unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API
     *        request using one of these actions, specify a client token in the request.</p> <note>
     *        <p>
     *        Avoid reusing the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, other than the Region or Availability Zone, the retry fails with an
     *        IdempotentParameterMismatch error.
     *        </p>
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token is a unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request
     * using one of these actions, specify a client token in the request.
     * </p>
     * <note>
     * <p>
     * Avoid reusing the same client token for other API requests. If you retry a request that completed successfully
     * using the same client token and the same parameters, the retry succeeds without performing any further actions.
     * If you retry a successful request using the same client token, but one or more of the parameters are different,
     * other than the Region or Availability Zone, the retry fails with an IdempotentParameterMismatch error.
     * </p>
     * </note>
     * 
     * @return A client token is a unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API
     *         request using one of these actions, specify a client token in the request.</p> <note>
     *         <p>
     *         Avoid reusing the same client token for other API requests. If you retry a request that completed
     *         successfully using the same client token and the same parameters, the retry succeeds without performing
     *         any further actions. If you retry a successful request using the same client token, but one or more of
     *         the parameters are different, other than the Region or Availability Zone, the retry fails with an
     *         IdempotentParameterMismatch error.
     *         </p>
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A client token is a unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request
     * using one of these actions, specify a client token in the request.
     * </p>
     * <note>
     * <p>
     * Avoid reusing the same client token for other API requests. If you retry a request that completed successfully
     * using the same client token and the same parameters, the retry succeeds without performing any further actions.
     * If you retry a successful request using the same client token, but one or more of the parameters are different,
     * other than the Region or Availability Zone, the retry fails with an IdempotentParameterMismatch error.
     * </p>
     * </note>
     * 
     * @param clientToken
     *        A client token is a unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API
     *        request using one of these actions, specify a client token in the request.</p> <note>
     *        <p>
     *        Avoid reusing the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, other than the Region or Availability Zone, the retry fails with an
     *        IdempotentParameterMismatch error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceEvaluationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: ").append(getResourceDetails()).append(",");
        if (getEvaluationContext() != null)
            sb.append("EvaluationContext: ").append(getEvaluationContext()).append(",");
        if (getEvaluationMode() != null)
            sb.append("EvaluationMode: ").append(getEvaluationMode()).append(",");
        if (getEvaluationTimeout() != null)
            sb.append("EvaluationTimeout: ").append(getEvaluationTimeout()).append(",");
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

        if (obj instanceof StartResourceEvaluationRequest == false)
            return false;
        StartResourceEvaluationRequest other = (StartResourceEvaluationRequest) obj;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        if (other.getEvaluationContext() == null ^ this.getEvaluationContext() == null)
            return false;
        if (other.getEvaluationContext() != null && other.getEvaluationContext().equals(this.getEvaluationContext()) == false)
            return false;
        if (other.getEvaluationMode() == null ^ this.getEvaluationMode() == null)
            return false;
        if (other.getEvaluationMode() != null && other.getEvaluationMode().equals(this.getEvaluationMode()) == false)
            return false;
        if (other.getEvaluationTimeout() == null ^ this.getEvaluationTimeout() == null)
            return false;
        if (other.getEvaluationTimeout() != null && other.getEvaluationTimeout().equals(this.getEvaluationTimeout()) == false)
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

        hashCode = prime * hashCode + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        hashCode = prime * hashCode + ((getEvaluationContext() == null) ? 0 : getEvaluationContext().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMode() == null) ? 0 : getEvaluationMode().hashCode());
        hashCode = prime * hashCode + ((getEvaluationTimeout() == null) ? 0 : getEvaluationTimeout().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartResourceEvaluationRequest clone() {
        return (StartResourceEvaluationRequest) super.clone();
    }

}
