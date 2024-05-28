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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/RetrieveAndGenerate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveAndGenerateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the query to be made to the knowledge base.
     * </p>
     */
    private RetrieveAndGenerateInput input;
    /**
     * <p>
     * Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     */
    private RetrieveAndGenerateConfiguration retrieveAndGenerateConfiguration;
    /**
     * <p>
     * Contains details about the session with the knowledge base.
     * </p>
     */
    private RetrieveAndGenerateSessionConfiguration sessionConfiguration;
    /**
     * <p>
     * The unique identifier of the session. Reuse the same value to continue the same session with the knowledge base.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * Contains the query to be made to the knowledge base.
     * </p>
     * 
     * @param input
     *        Contains the query to be made to the knowledge base.
     */

    public void setInput(RetrieveAndGenerateInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Contains the query to be made to the knowledge base.
     * </p>
     * 
     * @return Contains the query to be made to the knowledge base.
     */

    public RetrieveAndGenerateInput getInput() {
        return this.input;
    }

    /**
     * <p>
     * Contains the query to be made to the knowledge base.
     * </p>
     * 
     * @param input
     *        Contains the query to be made to the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveAndGenerateRequest withInput(RetrieveAndGenerateInput input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     * 
     * @param retrieveAndGenerateConfiguration
     *        Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     */

    public void setRetrieveAndGenerateConfiguration(RetrieveAndGenerateConfiguration retrieveAndGenerateConfiguration) {
        this.retrieveAndGenerateConfiguration = retrieveAndGenerateConfiguration;
    }

    /**
     * <p>
     * Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     * 
     * @return Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     */

    public RetrieveAndGenerateConfiguration getRetrieveAndGenerateConfiguration() {
        return this.retrieveAndGenerateConfiguration;
    }

    /**
     * <p>
     * Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     * 
     * @param retrieveAndGenerateConfiguration
     *        Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveAndGenerateRequest withRetrieveAndGenerateConfiguration(RetrieveAndGenerateConfiguration retrieveAndGenerateConfiguration) {
        setRetrieveAndGenerateConfiguration(retrieveAndGenerateConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains details about the session with the knowledge base.
     * </p>
     * 
     * @param sessionConfiguration
     *        Contains details about the session with the knowledge base.
     */

    public void setSessionConfiguration(RetrieveAndGenerateSessionConfiguration sessionConfiguration) {
        this.sessionConfiguration = sessionConfiguration;
    }

    /**
     * <p>
     * Contains details about the session with the knowledge base.
     * </p>
     * 
     * @return Contains details about the session with the knowledge base.
     */

    public RetrieveAndGenerateSessionConfiguration getSessionConfiguration() {
        return this.sessionConfiguration;
    }

    /**
     * <p>
     * Contains details about the session with the knowledge base.
     * </p>
     * 
     * @param sessionConfiguration
     *        Contains details about the session with the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveAndGenerateRequest withSessionConfiguration(RetrieveAndGenerateSessionConfiguration sessionConfiguration) {
        setSessionConfiguration(sessionConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the session. Reuse the same value to continue the same session with the knowledge base.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier of the session. Reuse the same value to continue the same session with the knowledge
     *        base.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The unique identifier of the session. Reuse the same value to continue the same session with the knowledge base.
     * </p>
     * 
     * @return The unique identifier of the session. Reuse the same value to continue the same session with the
     *         knowledge base.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The unique identifier of the session. Reuse the same value to continue the same session with the knowledge base.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier of the session. Reuse the same value to continue the same session with the knowledge
     *        base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveAndGenerateRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
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
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***").append(",");
        if (getRetrieveAndGenerateConfiguration() != null)
            sb.append("RetrieveAndGenerateConfiguration: ").append(getRetrieveAndGenerateConfiguration()).append(",");
        if (getSessionConfiguration() != null)
            sb.append("SessionConfiguration: ").append(getSessionConfiguration()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveAndGenerateRequest == false)
            return false;
        RetrieveAndGenerateRequest other = (RetrieveAndGenerateRequest) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getRetrieveAndGenerateConfiguration() == null ^ this.getRetrieveAndGenerateConfiguration() == null)
            return false;
        if (other.getRetrieveAndGenerateConfiguration() != null
                && other.getRetrieveAndGenerateConfiguration().equals(this.getRetrieveAndGenerateConfiguration()) == false)
            return false;
        if (other.getSessionConfiguration() == null ^ this.getSessionConfiguration() == null)
            return false;
        if (other.getSessionConfiguration() != null && other.getSessionConfiguration().equals(this.getSessionConfiguration()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getRetrieveAndGenerateConfiguration() == null) ? 0 : getRetrieveAndGenerateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSessionConfiguration() == null) ? 0 : getSessionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public RetrieveAndGenerateRequest clone() {
        return (RetrieveAndGenerateRequest) super.clone();
    }

}
