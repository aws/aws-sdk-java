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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of an analysis can be used in conditions to trigger actions. Analyses can inspect the email content and
 * report a certain aspect of the email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/Analysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Analysis implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Add On.
     * </p>
     */
    private String analyzer;
    /**
     * <p>
     * The returned value from an Add On.
     * </p>
     */
    private String resultField;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Add On.
     * </p>
     * 
     * @param analyzer
     *        The Amazon Resource Name (ARN) of an Add On.
     */

    public void setAnalyzer(String analyzer) {
        this.analyzer = analyzer;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Add On.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Add On.
     */

    public String getAnalyzer() {
        return this.analyzer;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Add On.
     * </p>
     * 
     * @param analyzer
     *        The Amazon Resource Name (ARN) of an Add On.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withAnalyzer(String analyzer) {
        setAnalyzer(analyzer);
        return this;
    }

    /**
     * <p>
     * The returned value from an Add On.
     * </p>
     * 
     * @param resultField
     *        The returned value from an Add On.
     */

    public void setResultField(String resultField) {
        this.resultField = resultField;
    }

    /**
     * <p>
     * The returned value from an Add On.
     * </p>
     * 
     * @return The returned value from an Add On.
     */

    public String getResultField() {
        return this.resultField;
    }

    /**
     * <p>
     * The returned value from an Add On.
     * </p>
     * 
     * @param resultField
     *        The returned value from an Add On.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withResultField(String resultField) {
        setResultField(resultField);
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
        if (getAnalyzer() != null)
            sb.append("Analyzer: ").append(getAnalyzer()).append(",");
        if (getResultField() != null)
            sb.append("ResultField: ").append(getResultField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Analysis == false)
            return false;
        Analysis other = (Analysis) obj;
        if (other.getAnalyzer() == null ^ this.getAnalyzer() == null)
            return false;
        if (other.getAnalyzer() != null && other.getAnalyzer().equals(this.getAnalyzer()) == false)
            return false;
        if (other.getResultField() == null ^ this.getResultField() == null)
            return false;
        if (other.getResultField() != null && other.getResultField().equals(this.getResultField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzer() == null) ? 0 : getAnalyzer().hashCode());
        hashCode = prime * hashCode + ((getResultField() == null) ? 0 : getResultField().hashCode());
        return hashCode;
    }

    @Override
    public Analysis clone() {
        try {
            return (Analysis) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.AnalysisMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
