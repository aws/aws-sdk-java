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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartCalculationExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCalculationExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The session ID.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * A description of the calculation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Contains configuration information for the calculation.
     * </p>
     */
    @Deprecated
    private CalculationConfiguration calculationConfiguration;
    /**
     * <p>
     * A string that contains the code of the calculation.
     * </p>
     */
    private String codeBlock;
    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the calculation is idempotent (executes only
     * once). If another <code>StartCalculationExecutionRequest</code> is received, the same response is returned and
     * another calculation is not created. If a parameter has changed, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @param sessionId
     *        The session ID.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @return The session ID.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @param sessionId
     *        The session ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCalculationExecutionRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * A description of the calculation.
     * </p>
     * 
     * @param description
     *        A description of the calculation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the calculation.
     * </p>
     * 
     * @return A description of the calculation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the calculation.
     * </p>
     * 
     * @param description
     *        A description of the calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCalculationExecutionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Contains configuration information for the calculation.
     * </p>
     * 
     * @param calculationConfiguration
     *        Contains configuration information for the calculation.
     */
    @Deprecated
    public void setCalculationConfiguration(CalculationConfiguration calculationConfiguration) {
        this.calculationConfiguration = calculationConfiguration;
    }

    /**
     * <p>
     * Contains configuration information for the calculation.
     * </p>
     * 
     * @return Contains configuration information for the calculation.
     */
    @Deprecated
    public CalculationConfiguration getCalculationConfiguration() {
        return this.calculationConfiguration;
    }

    /**
     * <p>
     * Contains configuration information for the calculation.
     * </p>
     * 
     * @param calculationConfiguration
     *        Contains configuration information for the calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public StartCalculationExecutionRequest withCalculationConfiguration(CalculationConfiguration calculationConfiguration) {
        setCalculationConfiguration(calculationConfiguration);
        return this;
    }

    /**
     * <p>
     * A string that contains the code of the calculation.
     * </p>
     * 
     * @param codeBlock
     *        A string that contains the code of the calculation.
     */

    public void setCodeBlock(String codeBlock) {
        this.codeBlock = codeBlock;
    }

    /**
     * <p>
     * A string that contains the code of the calculation.
     * </p>
     * 
     * @return A string that contains the code of the calculation.
     */

    public String getCodeBlock() {
        return this.codeBlock;
    }

    /**
     * <p>
     * A string that contains the code of the calculation.
     * </p>
     * 
     * @param codeBlock
     *        A string that contains the code of the calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCalculationExecutionRequest withCodeBlock(String codeBlock) {
        setCodeBlock(codeBlock);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the calculation is idempotent (executes only
     * once). If another <code>StartCalculationExecutionRequest</code> is received, the same response is returned and
     * another calculation is not created. If a parameter has changed, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @param clientRequestToken
     *        A unique case-sensitive string used to ensure the request to create the calculation is idempotent
     *        (executes only once). If another <code>StartCalculationExecutionRequest</code> is received, the same
     *        response is returned and another calculation is not created. If a parameter has changed, an error is
     *        returned.</p> <important>
     *        <p>
     *        This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services
     *        SDK for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the
     *        Amazon Web Services CLI, you must provide this token or the action will fail.
     *        </p>
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the calculation is idempotent (executes only
     * once). If another <code>StartCalculationExecutionRequest</code> is received, the same response is returned and
     * another calculation is not created. If a parameter has changed, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @return A unique case-sensitive string used to ensure the request to create the calculation is idempotent
     *         (executes only once). If another <code>StartCalculationExecutionRequest</code> is received, the same
     *         response is returned and another calculation is not created. If a parameter has changed, an error is
     *         returned.</p> <important>
     *         <p>
     *         This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web
     *         Services SDK for Java) auto-generate the token for users. If you are not using the Amazon Web Services
     *         SDK or the Amazon Web Services CLI, you must provide this token or the action will fail.
     *         </p>
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the calculation is idempotent (executes only
     * once). If another <code>StartCalculationExecutionRequest</code> is received, the same response is returned and
     * another calculation is not created. If a parameter has changed, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK
     * for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web
     * Services CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @param clientRequestToken
     *        A unique case-sensitive string used to ensure the request to create the calculation is idempotent
     *        (executes only once). If another <code>StartCalculationExecutionRequest</code> is received, the same
     *        response is returned and another calculation is not created. If a parameter has changed, an error is
     *        returned.</p> <important>
     *        <p>
     *        This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services
     *        SDK for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the
     *        Amazon Web Services CLI, you must provide this token or the action will fail.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCalculationExecutionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCalculationConfiguration() != null)
            sb.append("CalculationConfiguration: ").append(getCalculationConfiguration()).append(",");
        if (getCodeBlock() != null)
            sb.append("CodeBlock: ").append(getCodeBlock()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCalculationExecutionRequest == false)
            return false;
        StartCalculationExecutionRequest other = (StartCalculationExecutionRequest) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCalculationConfiguration() == null ^ this.getCalculationConfiguration() == null)
            return false;
        if (other.getCalculationConfiguration() != null && other.getCalculationConfiguration().equals(this.getCalculationConfiguration()) == false)
            return false;
        if (other.getCodeBlock() == null ^ this.getCodeBlock() == null)
            return false;
        if (other.getCodeBlock() != null && other.getCodeBlock().equals(this.getCodeBlock()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCalculationConfiguration() == null) ? 0 : getCalculationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCodeBlock() == null) ? 0 : getCodeBlock().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartCalculationExecutionRequest clone() {
        return (StartCalculationExecutionRequest) super.clone();
    }

}
