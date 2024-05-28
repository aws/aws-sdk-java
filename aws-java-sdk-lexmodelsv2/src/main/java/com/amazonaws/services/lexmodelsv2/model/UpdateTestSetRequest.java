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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateTestSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTestSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The test set Id for which update test operation to be performed.
     * </p>
     */
    private String testSetId;
    /**
     * <p>
     * The new test set name.
     * </p>
     */
    private String testSetName;
    /**
     * <p>
     * The new test set description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The test set Id for which update test operation to be performed.
     * </p>
     * 
     * @param testSetId
     *        The test set Id for which update test operation to be performed.
     */

    public void setTestSetId(String testSetId) {
        this.testSetId = testSetId;
    }

    /**
     * <p>
     * The test set Id for which update test operation to be performed.
     * </p>
     * 
     * @return The test set Id for which update test operation to be performed.
     */

    public String getTestSetId() {
        return this.testSetId;
    }

    /**
     * <p>
     * The test set Id for which update test operation to be performed.
     * </p>
     * 
     * @param testSetId
     *        The test set Id for which update test operation to be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSetRequest withTestSetId(String testSetId) {
        setTestSetId(testSetId);
        return this;
    }

    /**
     * <p>
     * The new test set name.
     * </p>
     * 
     * @param testSetName
     *        The new test set name.
     */

    public void setTestSetName(String testSetName) {
        this.testSetName = testSetName;
    }

    /**
     * <p>
     * The new test set name.
     * </p>
     * 
     * @return The new test set name.
     */

    public String getTestSetName() {
        return this.testSetName;
    }

    /**
     * <p>
     * The new test set name.
     * </p>
     * 
     * @param testSetName
     *        The new test set name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSetRequest withTestSetName(String testSetName) {
        setTestSetName(testSetName);
        return this;
    }

    /**
     * <p>
     * The new test set description.
     * </p>
     * 
     * @param description
     *        The new test set description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new test set description.
     * </p>
     * 
     * @return The new test set description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new test set description.
     * </p>
     * 
     * @param description
     *        The new test set description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSetRequest withDescription(String description) {
        setDescription(description);
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
        if (getTestSetName() != null)
            sb.append("TestSetName: ").append(getTestSetName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTestSetRequest == false)
            return false;
        UpdateTestSetRequest other = (UpdateTestSetRequest) obj;
        if (other.getTestSetId() == null ^ this.getTestSetId() == null)
            return false;
        if (other.getTestSetId() != null && other.getTestSetId().equals(this.getTestSetId()) == false)
            return false;
        if (other.getTestSetName() == null ^ this.getTestSetName() == null)
            return false;
        if (other.getTestSetName() != null && other.getTestSetName().equals(this.getTestSetName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSetId() == null) ? 0 : getTestSetId().hashCode());
        hashCode = prime * hashCode + ((getTestSetName() == null) ? 0 : getTestSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTestSetRequest clone() {
        return (UpdateTestSetRequest) super.clone();
    }

}
