/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StopSuiteRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopSuiteRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Suite definition Id of the test suite run to be stopped.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * Suite run Id of the test suite run to be stopped.
     * </p>
     */
    private String suiteRunId;

    /**
     * <p>
     * Suite definition Id of the test suite run to be stopped.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id of the test suite run to be stopped.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id of the test suite run to be stopped.
     * </p>
     * 
     * @return Suite definition Id of the test suite run to be stopped.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id of the test suite run to be stopped.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id of the test suite run to be stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopSuiteRunRequest withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * Suite run Id of the test suite run to be stopped.
     * </p>
     * 
     * @param suiteRunId
     *        Suite run Id of the test suite run to be stopped.
     */

    public void setSuiteRunId(String suiteRunId) {
        this.suiteRunId = suiteRunId;
    }

    /**
     * <p>
     * Suite run Id of the test suite run to be stopped.
     * </p>
     * 
     * @return Suite run Id of the test suite run to be stopped.
     */

    public String getSuiteRunId() {
        return this.suiteRunId;
    }

    /**
     * <p>
     * Suite run Id of the test suite run to be stopped.
     * </p>
     * 
     * @param suiteRunId
     *        Suite run Id of the test suite run to be stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopSuiteRunRequest withSuiteRunId(String suiteRunId) {
        setSuiteRunId(suiteRunId);
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
        if (getSuiteDefinitionId() != null)
            sb.append("SuiteDefinitionId: ").append(getSuiteDefinitionId()).append(",");
        if (getSuiteRunId() != null)
            sb.append("SuiteRunId: ").append(getSuiteRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopSuiteRunRequest == false)
            return false;
        StopSuiteRunRequest other = (StopSuiteRunRequest) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteRunId() == null ^ this.getSuiteRunId() == null)
            return false;
        if (other.getSuiteRunId() != null && other.getSuiteRunId().equals(this.getSuiteRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteRunId() == null) ? 0 : getSuiteRunId().hashCode());
        return hashCode;
    }

    @Override
    public StopSuiteRunRequest clone() {
        return (StopSuiteRunRequest) super.clone();
    }

}
