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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the test set that is exported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestSetExportSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSetExportSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the test set.
     * </p>
     */
    private String testSetId;

    /**
     * <p>
     * The unique identifier of the test set.
     * </p>
     * 
     * @param testSetId
     *        The unique identifier of the test set.
     */

    public void setTestSetId(String testSetId) {
        this.testSetId = testSetId;
    }

    /**
     * <p>
     * The unique identifier of the test set.
     * </p>
     * 
     * @return The unique identifier of the test set.
     */

    public String getTestSetId() {
        return this.testSetId;
    }

    /**
     * <p>
     * The unique identifier of the test set.
     * </p>
     * 
     * @param testSetId
     *        The unique identifier of the test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetExportSpecification withTestSetId(String testSetId) {
        setTestSetId(testSetId);
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
            sb.append("TestSetId: ").append(getTestSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestSetExportSpecification == false)
            return false;
        TestSetExportSpecification other = (TestSetExportSpecification) obj;
        if (other.getTestSetId() == null ^ this.getTestSetId() == null)
            return false;
        if (other.getTestSetId() != null && other.getTestSetId().equals(this.getTestSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSetId() == null) ? 0 : getTestSetId().hashCode());
        return hashCode;
    }

    @Override
    public TestSetExportSpecification clone() {
        try {
            return (TestSetExportSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestSetExportSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
