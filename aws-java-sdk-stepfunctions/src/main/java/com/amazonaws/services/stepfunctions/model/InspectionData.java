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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains additional details about the state's execution, including its input and output data processing flow, and
 * HTTP request and response information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/InspectionData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InspectionData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The raw state input.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The input after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-inputpath"
     * >InputPath</a> filter.
     * </p>
     */
    private String afterInputPath;
    /**
     * <p>
     * The effective input after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters"
     * >Parameters</a> filter.
     * </p>
     */
    private String afterParameters;
    /**
     * <p>
     * The state's raw result.
     * </p>
     */
    private String result;
    /**
     * <p>
     * The effective result after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector"
     * >ResultSelector</a> filter.
     * </p>
     */
    private String afterResultSelector;
    /**
     * <p>
     * The effective result combined with the raw state input after Step Functions applies the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultpath.html">ResultPath</a> filter.
     * </p>
     */
    private String afterResultPath;
    /**
     * <p>
     * The raw HTTP request that is sent when you test an HTTP Task.
     * </p>
     */
    private InspectionDataRequest request;
    /**
     * <p>
     * The raw HTTP response that is returned when you test an HTTP Task.
     * </p>
     */
    private InspectionDataResponse response;

    /**
     * <p>
     * The raw state input.
     * </p>
     * 
     * @param input
     *        The raw state input.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The raw state input.
     * </p>
     * 
     * @return The raw state input.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The raw state input.
     * </p>
     * 
     * @param input
     *        The raw state input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionData withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The input after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-inputpath"
     * >InputPath</a> filter.
     * </p>
     * 
     * @param afterInputPath
     *        The input after Step Functions applies the <a href=
     *        "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-inputpath"
     *        >InputPath</a> filter.
     */

    public void setAfterInputPath(String afterInputPath) {
        this.afterInputPath = afterInputPath;
    }

    /**
     * <p>
     * The input after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-inputpath"
     * >InputPath</a> filter.
     * </p>
     * 
     * @return The input after Step Functions applies the <a href=
     *         "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-inputpath"
     *         >InputPath</a> filter.
     */

    public String getAfterInputPath() {
        return this.afterInputPath;
    }

    /**
     * <p>
     * The input after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-inputpath"
     * >InputPath</a> filter.
     * </p>
     * 
     * @param afterInputPath
     *        The input after Step Functions applies the <a href=
     *        "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-inputpath"
     *        >InputPath</a> filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionData withAfterInputPath(String afterInputPath) {
        setAfterInputPath(afterInputPath);
        return this;
    }

    /**
     * <p>
     * The effective input after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters"
     * >Parameters</a> filter.
     * </p>
     * 
     * @param afterParameters
     *        The effective input after Step Functions applies the <a href=
     *        "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters"
     *        >Parameters</a> filter.
     */

    public void setAfterParameters(String afterParameters) {
        this.afterParameters = afterParameters;
    }

    /**
     * <p>
     * The effective input after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters"
     * >Parameters</a> filter.
     * </p>
     * 
     * @return The effective input after Step Functions applies the <a href=
     *         "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters"
     *         >Parameters</a> filter.
     */

    public String getAfterParameters() {
        return this.afterParameters;
    }

    /**
     * <p>
     * The effective input after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters"
     * >Parameters</a> filter.
     * </p>
     * 
     * @param afterParameters
     *        The effective input after Step Functions applies the <a href=
     *        "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters"
     *        >Parameters</a> filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionData withAfterParameters(String afterParameters) {
        setAfterParameters(afterParameters);
        return this;
    }

    /**
     * <p>
     * The state's raw result.
     * </p>
     * 
     * @param result
     *        The state's raw result.
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * The state's raw result.
     * </p>
     * 
     * @return The state's raw result.
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * The state's raw result.
     * </p>
     * 
     * @param result
     *        The state's raw result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionData withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The effective result after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector"
     * >ResultSelector</a> filter.
     * </p>
     * 
     * @param afterResultSelector
     *        The effective result after Step Functions applies the <a href=
     *        "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector"
     *        >ResultSelector</a> filter.
     */

    public void setAfterResultSelector(String afterResultSelector) {
        this.afterResultSelector = afterResultSelector;
    }

    /**
     * <p>
     * The effective result after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector"
     * >ResultSelector</a> filter.
     * </p>
     * 
     * @return The effective result after Step Functions applies the <a href=
     *         "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector"
     *         >ResultSelector</a> filter.
     */

    public String getAfterResultSelector() {
        return this.afterResultSelector;
    }

    /**
     * <p>
     * The effective result after Step Functions applies the <a href=
     * "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector"
     * >ResultSelector</a> filter.
     * </p>
     * 
     * @param afterResultSelector
     *        The effective result after Step Functions applies the <a href=
     *        "https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector"
     *        >ResultSelector</a> filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionData withAfterResultSelector(String afterResultSelector) {
        setAfterResultSelector(afterResultSelector);
        return this;
    }

    /**
     * <p>
     * The effective result combined with the raw state input after Step Functions applies the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultpath.html">ResultPath</a> filter.
     * </p>
     * 
     * @param afterResultPath
     *        The effective result combined with the raw state input after Step Functions applies the <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultpath.html">ResultPath</a>
     *        filter.
     */

    public void setAfterResultPath(String afterResultPath) {
        this.afterResultPath = afterResultPath;
    }

    /**
     * <p>
     * The effective result combined with the raw state input after Step Functions applies the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultpath.html">ResultPath</a> filter.
     * </p>
     * 
     * @return The effective result combined with the raw state input after Step Functions applies the <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultpath.html">ResultPath</a>
     *         filter.
     */

    public String getAfterResultPath() {
        return this.afterResultPath;
    }

    /**
     * <p>
     * The effective result combined with the raw state input after Step Functions applies the <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultpath.html">ResultPath</a> filter.
     * </p>
     * 
     * @param afterResultPath
     *        The effective result combined with the raw state input after Step Functions applies the <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultpath.html">ResultPath</a>
     *        filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionData withAfterResultPath(String afterResultPath) {
        setAfterResultPath(afterResultPath);
        return this;
    }

    /**
     * <p>
     * The raw HTTP request that is sent when you test an HTTP Task.
     * </p>
     * 
     * @param request
     *        The raw HTTP request that is sent when you test an HTTP Task.
     */

    public void setRequest(InspectionDataRequest request) {
        this.request = request;
    }

    /**
     * <p>
     * The raw HTTP request that is sent when you test an HTTP Task.
     * </p>
     * 
     * @return The raw HTTP request that is sent when you test an HTTP Task.
     */

    public InspectionDataRequest getRequest() {
        return this.request;
    }

    /**
     * <p>
     * The raw HTTP request that is sent when you test an HTTP Task.
     * </p>
     * 
     * @param request
     *        The raw HTTP request that is sent when you test an HTTP Task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionData withRequest(InspectionDataRequest request) {
        setRequest(request);
        return this;
    }

    /**
     * <p>
     * The raw HTTP response that is returned when you test an HTTP Task.
     * </p>
     * 
     * @param response
     *        The raw HTTP response that is returned when you test an HTTP Task.
     */

    public void setResponse(InspectionDataResponse response) {
        this.response = response;
    }

    /**
     * <p>
     * The raw HTTP response that is returned when you test an HTTP Task.
     * </p>
     * 
     * @return The raw HTTP response that is returned when you test an HTTP Task.
     */

    public InspectionDataResponse getResponse() {
        return this.response;
    }

    /**
     * <p>
     * The raw HTTP response that is returned when you test an HTTP Task.
     * </p>
     * 
     * @param response
     *        The raw HTTP response that is returned when you test an HTTP Task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionData withResponse(InspectionDataResponse response) {
        setResponse(response);
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
        if (getAfterInputPath() != null)
            sb.append("AfterInputPath: ").append("***Sensitive Data Redacted***").append(",");
        if (getAfterParameters() != null)
            sb.append("AfterParameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getResult() != null)
            sb.append("Result: ").append("***Sensitive Data Redacted***").append(",");
        if (getAfterResultSelector() != null)
            sb.append("AfterResultSelector: ").append("***Sensitive Data Redacted***").append(",");
        if (getAfterResultPath() != null)
            sb.append("AfterResultPath: ").append("***Sensitive Data Redacted***").append(",");
        if (getRequest() != null)
            sb.append("Request: ").append(getRequest()).append(",");
        if (getResponse() != null)
            sb.append("Response: ").append(getResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InspectionData == false)
            return false;
        InspectionData other = (InspectionData) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getAfterInputPath() == null ^ this.getAfterInputPath() == null)
            return false;
        if (other.getAfterInputPath() != null && other.getAfterInputPath().equals(this.getAfterInputPath()) == false)
            return false;
        if (other.getAfterParameters() == null ^ this.getAfterParameters() == null)
            return false;
        if (other.getAfterParameters() != null && other.getAfterParameters().equals(this.getAfterParameters()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getAfterResultSelector() == null ^ this.getAfterResultSelector() == null)
            return false;
        if (other.getAfterResultSelector() != null && other.getAfterResultSelector().equals(this.getAfterResultSelector()) == false)
            return false;
        if (other.getAfterResultPath() == null ^ this.getAfterResultPath() == null)
            return false;
        if (other.getAfterResultPath() != null && other.getAfterResultPath().equals(this.getAfterResultPath()) == false)
            return false;
        if (other.getRequest() == null ^ this.getRequest() == null)
            return false;
        if (other.getRequest() != null && other.getRequest().equals(this.getRequest()) == false)
            return false;
        if (other.getResponse() == null ^ this.getResponse() == null)
            return false;
        if (other.getResponse() != null && other.getResponse().equals(this.getResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getAfterInputPath() == null) ? 0 : getAfterInputPath().hashCode());
        hashCode = prime * hashCode + ((getAfterParameters() == null) ? 0 : getAfterParameters().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getAfterResultSelector() == null) ? 0 : getAfterResultSelector().hashCode());
        hashCode = prime * hashCode + ((getAfterResultPath() == null) ? 0 : getAfterResultPath().hashCode());
        hashCode = prime * hashCode + ((getRequest() == null) ? 0 : getRequest().hashCode());
        hashCode = prime * hashCode + ((getResponse() == null) ? 0 : getResponse().hashCode());
        return hashCode;
    }

    @Override
    public InspectionData clone() {
        try {
            return (InspectionData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.InspectionDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
