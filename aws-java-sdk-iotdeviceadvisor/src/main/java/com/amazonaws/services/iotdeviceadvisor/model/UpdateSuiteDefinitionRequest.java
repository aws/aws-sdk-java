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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/UpdateSuiteDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSuiteDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Suite definition Id of the test suite to be updated.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition configuration.
     * </p>
     */
    private SuiteDefinitionConfiguration suiteDefinitionConfiguration;

    /**
     * <p>
     * Suite definition Id of the test suite to be updated.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id of the test suite to be updated.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id of the test suite to be updated.
     * </p>
     * 
     * @return Suite definition Id of the test suite to be updated.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id of the test suite to be updated.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id of the test suite to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSuiteDefinitionRequest withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition configuration.
     * </p>
     * 
     * @param suiteDefinitionConfiguration
     *        Updates a Device Advisor test suite with suite definition configuration.
     */

    public void setSuiteDefinitionConfiguration(SuiteDefinitionConfiguration suiteDefinitionConfiguration) {
        this.suiteDefinitionConfiguration = suiteDefinitionConfiguration;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition configuration.
     * </p>
     * 
     * @return Updates a Device Advisor test suite with suite definition configuration.
     */

    public SuiteDefinitionConfiguration getSuiteDefinitionConfiguration() {
        return this.suiteDefinitionConfiguration;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition configuration.
     * </p>
     * 
     * @param suiteDefinitionConfiguration
     *        Updates a Device Advisor test suite with suite definition configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSuiteDefinitionRequest withSuiteDefinitionConfiguration(SuiteDefinitionConfiguration suiteDefinitionConfiguration) {
        setSuiteDefinitionConfiguration(suiteDefinitionConfiguration);
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
        if (getSuiteDefinitionConfiguration() != null)
            sb.append("SuiteDefinitionConfiguration: ").append(getSuiteDefinitionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSuiteDefinitionRequest == false)
            return false;
        UpdateSuiteDefinitionRequest other = (UpdateSuiteDefinitionRequest) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteDefinitionConfiguration() == null ^ this.getSuiteDefinitionConfiguration() == null)
            return false;
        if (other.getSuiteDefinitionConfiguration() != null && other.getSuiteDefinitionConfiguration().equals(this.getSuiteDefinitionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionConfiguration() == null) ? 0 : getSuiteDefinitionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSuiteDefinitionRequest clone() {
        return (UpdateSuiteDefinitionRequest) super.clone();
    }

}
