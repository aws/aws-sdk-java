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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartTestExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTestExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The test set Id for the test set execution.
     * </p>
     */
    private String testSetId;
    /**
     * <p>
     * The target bot for the test set execution.
     * </p>
     */
    private TestExecutionTarget target;
    /**
     * <p>
     * Indicates whether we use streaming or non-streaming APIs for the test set execution. For streaming,
     * StartConversation Runtime API is used. Whereas, for non-streaming, RecognizeUtterance and RecognizeText Amazon
     * Lex Runtime API are used.
     * </p>
     */
    private String apiMode;
    /**
     * <p>
     * Indicates whether audio or text is used.
     * </p>
     */
    private String testExecutionModality;

    /**
     * <p>
     * The test set Id for the test set execution.
     * </p>
     * 
     * @param testSetId
     *        The test set Id for the test set execution.
     */

    public void setTestSetId(String testSetId) {
        this.testSetId = testSetId;
    }

    /**
     * <p>
     * The test set Id for the test set execution.
     * </p>
     * 
     * @return The test set Id for the test set execution.
     */

    public String getTestSetId() {
        return this.testSetId;
    }

    /**
     * <p>
     * The test set Id for the test set execution.
     * </p>
     * 
     * @param testSetId
     *        The test set Id for the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestExecutionRequest withTestSetId(String testSetId) {
        setTestSetId(testSetId);
        return this;
    }

    /**
     * <p>
     * The target bot for the test set execution.
     * </p>
     * 
     * @param target
     *        The target bot for the test set execution.
     */

    public void setTarget(TestExecutionTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * The target bot for the test set execution.
     * </p>
     * 
     * @return The target bot for the test set execution.
     */

    public TestExecutionTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target bot for the test set execution.
     * </p>
     * 
     * @param target
     *        The target bot for the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestExecutionRequest withTarget(TestExecutionTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Indicates whether we use streaming or non-streaming APIs for the test set execution. For streaming,
     * StartConversation Runtime API is used. Whereas, for non-streaming, RecognizeUtterance and RecognizeText Amazon
     * Lex Runtime API are used.
     * </p>
     * 
     * @param apiMode
     *        Indicates whether we use streaming or non-streaming APIs for the test set execution. For streaming,
     *        StartConversation Runtime API is used. Whereas, for non-streaming, RecognizeUtterance and RecognizeText
     *        Amazon Lex Runtime API are used.
     * @see TestExecutionApiMode
     */

    public void setApiMode(String apiMode) {
        this.apiMode = apiMode;
    }

    /**
     * <p>
     * Indicates whether we use streaming or non-streaming APIs for the test set execution. For streaming,
     * StartConversation Runtime API is used. Whereas, for non-streaming, RecognizeUtterance and RecognizeText Amazon
     * Lex Runtime API are used.
     * </p>
     * 
     * @return Indicates whether we use streaming or non-streaming APIs for the test set execution. For streaming,
     *         StartConversation Runtime API is used. Whereas, for non-streaming, RecognizeUtterance and RecognizeText
     *         Amazon Lex Runtime API are used.
     * @see TestExecutionApiMode
     */

    public String getApiMode() {
        return this.apiMode;
    }

    /**
     * <p>
     * Indicates whether we use streaming or non-streaming APIs for the test set execution. For streaming,
     * StartConversation Runtime API is used. Whereas, for non-streaming, RecognizeUtterance and RecognizeText Amazon
     * Lex Runtime API are used.
     * </p>
     * 
     * @param apiMode
     *        Indicates whether we use streaming or non-streaming APIs for the test set execution. For streaming,
     *        StartConversation Runtime API is used. Whereas, for non-streaming, RecognizeUtterance and RecognizeText
     *        Amazon Lex Runtime API are used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionApiMode
     */

    public StartTestExecutionRequest withApiMode(String apiMode) {
        setApiMode(apiMode);
        return this;
    }

    /**
     * <p>
     * Indicates whether we use streaming or non-streaming APIs for the test set execution. For streaming,
     * StartConversation Runtime API is used. Whereas, for non-streaming, RecognizeUtterance and RecognizeText Amazon
     * Lex Runtime API are used.
     * </p>
     * 
     * @param apiMode
     *        Indicates whether we use streaming or non-streaming APIs for the test set execution. For streaming,
     *        StartConversation Runtime API is used. Whereas, for non-streaming, RecognizeUtterance and RecognizeText
     *        Amazon Lex Runtime API are used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionApiMode
     */

    public StartTestExecutionRequest withApiMode(TestExecutionApiMode apiMode) {
        this.apiMode = apiMode.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether audio or text is used.
     * </p>
     * 
     * @param testExecutionModality
     *        Indicates whether audio or text is used.
     * @see TestExecutionModality
     */

    public void setTestExecutionModality(String testExecutionModality) {
        this.testExecutionModality = testExecutionModality;
    }

    /**
     * <p>
     * Indicates whether audio or text is used.
     * </p>
     * 
     * @return Indicates whether audio or text is used.
     * @see TestExecutionModality
     */

    public String getTestExecutionModality() {
        return this.testExecutionModality;
    }

    /**
     * <p>
     * Indicates whether audio or text is used.
     * </p>
     * 
     * @param testExecutionModality
     *        Indicates whether audio or text is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionModality
     */

    public StartTestExecutionRequest withTestExecutionModality(String testExecutionModality) {
        setTestExecutionModality(testExecutionModality);
        return this;
    }

    /**
     * <p>
     * Indicates whether audio or text is used.
     * </p>
     * 
     * @param testExecutionModality
     *        Indicates whether audio or text is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionModality
     */

    public StartTestExecutionRequest withTestExecutionModality(TestExecutionModality testExecutionModality) {
        this.testExecutionModality = testExecutionModality.toString();
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
        if (getTestSetId() != null)
            sb.append("TestSetId: ").append(getTestSetId()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getApiMode() != null)
            sb.append("ApiMode: ").append(getApiMode()).append(",");
        if (getTestExecutionModality() != null)
            sb.append("TestExecutionModality: ").append(getTestExecutionModality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTestExecutionRequest == false)
            return false;
        StartTestExecutionRequest other = (StartTestExecutionRequest) obj;
        if (other.getTestSetId() == null ^ this.getTestSetId() == null)
            return false;
        if (other.getTestSetId() != null && other.getTestSetId().equals(this.getTestSetId()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getApiMode() == null ^ this.getApiMode() == null)
            return false;
        if (other.getApiMode() != null && other.getApiMode().equals(this.getApiMode()) == false)
            return false;
        if (other.getTestExecutionModality() == null ^ this.getTestExecutionModality() == null)
            return false;
        if (other.getTestExecutionModality() != null && other.getTestExecutionModality().equals(this.getTestExecutionModality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSetId() == null) ? 0 : getTestSetId().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getApiMode() == null) ? 0 : getApiMode().hashCode());
        hashCode = prime * hashCode + ((getTestExecutionModality() == null) ? 0 : getTestExecutionModality().hashCode());
        return hashCode;
    }

    @Override
    public StartTestExecutionRequest clone() {
        return (StartTestExecutionRequest) super.clone();
    }

}
