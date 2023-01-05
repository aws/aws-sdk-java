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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/CreateSuiteDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSuiteDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The UUID of the test suite created.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the test suite.
     * </p>
     */
    private String suiteDefinitionArn;
    /**
     * <p>
     * The suite definition name of the test suite. This is a required parameter.
     * </p>
     */
    private String suiteDefinitionName;
    /**
     * <p>
     * The timestamp of when the test suite was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The UUID of the test suite created.
     * </p>
     * 
     * @param suiteDefinitionId
     *        The UUID of the test suite created.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * The UUID of the test suite created.
     * </p>
     * 
     * @return The UUID of the test suite created.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * The UUID of the test suite created.
     * </p>
     * 
     * @param suiteDefinitionId
     *        The UUID of the test suite created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSuiteDefinitionResult withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the test suite.
     * </p>
     * 
     * @param suiteDefinitionArn
     *        The Amazon Resource Name (ARN) of the test suite.
     */

    public void setSuiteDefinitionArn(String suiteDefinitionArn) {
        this.suiteDefinitionArn = suiteDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the test suite.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the test suite.
     */

    public String getSuiteDefinitionArn() {
        return this.suiteDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the test suite.
     * </p>
     * 
     * @param suiteDefinitionArn
     *        The Amazon Resource Name (ARN) of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSuiteDefinitionResult withSuiteDefinitionArn(String suiteDefinitionArn) {
        setSuiteDefinitionArn(suiteDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The suite definition name of the test suite. This is a required parameter.
     * </p>
     * 
     * @param suiteDefinitionName
     *        The suite definition name of the test suite. This is a required parameter.
     */

    public void setSuiteDefinitionName(String suiteDefinitionName) {
        this.suiteDefinitionName = suiteDefinitionName;
    }

    /**
     * <p>
     * The suite definition name of the test suite. This is a required parameter.
     * </p>
     * 
     * @return The suite definition name of the test suite. This is a required parameter.
     */

    public String getSuiteDefinitionName() {
        return this.suiteDefinitionName;
    }

    /**
     * <p>
     * The suite definition name of the test suite. This is a required parameter.
     * </p>
     * 
     * @param suiteDefinitionName
     *        The suite definition name of the test suite. This is a required parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSuiteDefinitionResult withSuiteDefinitionName(String suiteDefinitionName) {
        setSuiteDefinitionName(suiteDefinitionName);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the test suite was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the test suite was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the test suite was created.
     * </p>
     * 
     * @return The timestamp of when the test suite was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the test suite was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the test suite was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSuiteDefinitionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getSuiteDefinitionArn() != null)
            sb.append("SuiteDefinitionArn: ").append(getSuiteDefinitionArn()).append(",");
        if (getSuiteDefinitionName() != null)
            sb.append("SuiteDefinitionName: ").append(getSuiteDefinitionName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSuiteDefinitionResult == false)
            return false;
        CreateSuiteDefinitionResult other = (CreateSuiteDefinitionResult) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteDefinitionArn() == null ^ this.getSuiteDefinitionArn() == null)
            return false;
        if (other.getSuiteDefinitionArn() != null && other.getSuiteDefinitionArn().equals(this.getSuiteDefinitionArn()) == false)
            return false;
        if (other.getSuiteDefinitionName() == null ^ this.getSuiteDefinitionName() == null)
            return false;
        if (other.getSuiteDefinitionName() != null && other.getSuiteDefinitionName().equals(this.getSuiteDefinitionName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionArn() == null) ? 0 : getSuiteDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionName() == null) ? 0 : getSuiteDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public CreateSuiteDefinitionResult clone() {
        try {
            return (CreateSuiteDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
