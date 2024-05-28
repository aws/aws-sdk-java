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
 * Contains information about the test set that is imported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestSetImportResourceSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSetImportResourceSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the test set.
     * </p>
     */
    private String testSetName;
    /**
     * <p>
     * The description of the test set.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the test set.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Contains information about the location that Amazon Lex uses to store the test-set.
     * </p>
     */
    private TestSetStorageLocation storageLocation;
    /**
     * <p>
     * Contains information about the input location from where test-set should be imported.
     * </p>
     */
    private TestSetImportInputLocation importInputLocation;
    /**
     * <p>
     * Specifies whether the test-set being imported contains written or spoken data.
     * </p>
     */
    private String modality;
    /**
     * <p>
     * A list of tags to add to the test set. You can only add tags when you import/generate a new test set. You can't
     * use the <code>UpdateTestSet</code> operation to update tags. To update tags, use the <code>TagResource</code>
     * operation.
     * </p>
     */
    private java.util.Map<String, String> testSetTags;

    /**
     * <p>
     * The name of the test set.
     * </p>
     * 
     * @param testSetName
     *        The name of the test set.
     */

    public void setTestSetName(String testSetName) {
        this.testSetName = testSetName;
    }

    /**
     * <p>
     * The name of the test set.
     * </p>
     * 
     * @return The name of the test set.
     */

    public String getTestSetName() {
        return this.testSetName;
    }

    /**
     * <p>
     * The name of the test set.
     * </p>
     * 
     * @param testSetName
     *        The name of the test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetImportResourceSpecification withTestSetName(String testSetName) {
        setTestSetName(testSetName);
        return this;
    }

    /**
     * <p>
     * The description of the test set.
     * </p>
     * 
     * @param description
     *        The description of the test set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the test set.
     * </p>
     * 
     * @return The description of the test set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the test set.
     * </p>
     * 
     * @param description
     *        The description of the test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetImportResourceSpecification withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the test set.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permission to access the test set.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the test set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that has permission to access the test set.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the test set.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permission to access the test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetImportResourceSpecification withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Contains information about the location that Amazon Lex uses to store the test-set.
     * </p>
     * 
     * @param storageLocation
     *        Contains information about the location that Amazon Lex uses to store the test-set.
     */

    public void setStorageLocation(TestSetStorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * Contains information about the location that Amazon Lex uses to store the test-set.
     * </p>
     * 
     * @return Contains information about the location that Amazon Lex uses to store the test-set.
     */

    public TestSetStorageLocation getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * Contains information about the location that Amazon Lex uses to store the test-set.
     * </p>
     * 
     * @param storageLocation
     *        Contains information about the location that Amazon Lex uses to store the test-set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetImportResourceSpecification withStorageLocation(TestSetStorageLocation storageLocation) {
        setStorageLocation(storageLocation);
        return this;
    }

    /**
     * <p>
     * Contains information about the input location from where test-set should be imported.
     * </p>
     * 
     * @param importInputLocation
     *        Contains information about the input location from where test-set should be imported.
     */

    public void setImportInputLocation(TestSetImportInputLocation importInputLocation) {
        this.importInputLocation = importInputLocation;
    }

    /**
     * <p>
     * Contains information about the input location from where test-set should be imported.
     * </p>
     * 
     * @return Contains information about the input location from where test-set should be imported.
     */

    public TestSetImportInputLocation getImportInputLocation() {
        return this.importInputLocation;
    }

    /**
     * <p>
     * Contains information about the input location from where test-set should be imported.
     * </p>
     * 
     * @param importInputLocation
     *        Contains information about the input location from where test-set should be imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetImportResourceSpecification withImportInputLocation(TestSetImportInputLocation importInputLocation) {
        setImportInputLocation(importInputLocation);
        return this;
    }

    /**
     * <p>
     * Specifies whether the test-set being imported contains written or spoken data.
     * </p>
     * 
     * @param modality
     *        Specifies whether the test-set being imported contains written or spoken data.
     * @see TestSetModality
     */

    public void setModality(String modality) {
        this.modality = modality;
    }

    /**
     * <p>
     * Specifies whether the test-set being imported contains written or spoken data.
     * </p>
     * 
     * @return Specifies whether the test-set being imported contains written or spoken data.
     * @see TestSetModality
     */

    public String getModality() {
        return this.modality;
    }

    /**
     * <p>
     * Specifies whether the test-set being imported contains written or spoken data.
     * </p>
     * 
     * @param modality
     *        Specifies whether the test-set being imported contains written or spoken data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSetModality
     */

    public TestSetImportResourceSpecification withModality(String modality) {
        setModality(modality);
        return this;
    }

    /**
     * <p>
     * Specifies whether the test-set being imported contains written or spoken data.
     * </p>
     * 
     * @param modality
     *        Specifies whether the test-set being imported contains written or spoken data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSetModality
     */

    public TestSetImportResourceSpecification withModality(TestSetModality modality) {
        this.modality = modality.toString();
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the test set. You can only add tags when you import/generate a new test set. You can't
     * use the <code>UpdateTestSet</code> operation to update tags. To update tags, use the <code>TagResource</code>
     * operation.
     * </p>
     * 
     * @return A list of tags to add to the test set. You can only add tags when you import/generate a new test set. You
     *         can't use the <code>UpdateTestSet</code> operation to update tags. To update tags, use the
     *         <code>TagResource</code> operation.
     */

    public java.util.Map<String, String> getTestSetTags() {
        return testSetTags;
    }

    /**
     * <p>
     * A list of tags to add to the test set. You can only add tags when you import/generate a new test set. You can't
     * use the <code>UpdateTestSet</code> operation to update tags. To update tags, use the <code>TagResource</code>
     * operation.
     * </p>
     * 
     * @param testSetTags
     *        A list of tags to add to the test set. You can only add tags when you import/generate a new test set. You
     *        can't use the <code>UpdateTestSet</code> operation to update tags. To update tags, use the
     *        <code>TagResource</code> operation.
     */

    public void setTestSetTags(java.util.Map<String, String> testSetTags) {
        this.testSetTags = testSetTags;
    }

    /**
     * <p>
     * A list of tags to add to the test set. You can only add tags when you import/generate a new test set. You can't
     * use the <code>UpdateTestSet</code> operation to update tags. To update tags, use the <code>TagResource</code>
     * operation.
     * </p>
     * 
     * @param testSetTags
     *        A list of tags to add to the test set. You can only add tags when you import/generate a new test set. You
     *        can't use the <code>UpdateTestSet</code> operation to update tags. To update tags, use the
     *        <code>TagResource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetImportResourceSpecification withTestSetTags(java.util.Map<String, String> testSetTags) {
        setTestSetTags(testSetTags);
        return this;
    }

    /**
     * Add a single TestSetTags entry
     *
     * @see TestSetImportResourceSpecification#withTestSetTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TestSetImportResourceSpecification addTestSetTagsEntry(String key, String value) {
        if (null == this.testSetTags) {
            this.testSetTags = new java.util.HashMap<String, String>();
        }
        if (this.testSetTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.testSetTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TestSetTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetImportResourceSpecification clearTestSetTagsEntries() {
        this.testSetTags = null;
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
        if (getTestSetName() != null)
            sb.append("TestSetName: ").append(getTestSetName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: ").append(getStorageLocation()).append(",");
        if (getImportInputLocation() != null)
            sb.append("ImportInputLocation: ").append(getImportInputLocation()).append(",");
        if (getModality() != null)
            sb.append("Modality: ").append(getModality()).append(",");
        if (getTestSetTags() != null)
            sb.append("TestSetTags: ").append(getTestSetTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestSetImportResourceSpecification == false)
            return false;
        TestSetImportResourceSpecification other = (TestSetImportResourceSpecification) obj;
        if (other.getTestSetName() == null ^ this.getTestSetName() == null)
            return false;
        if (other.getTestSetName() != null && other.getTestSetName().equals(this.getTestSetName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStorageLocation() == null ^ this.getStorageLocation() == null)
            return false;
        if (other.getStorageLocation() != null && other.getStorageLocation().equals(this.getStorageLocation()) == false)
            return false;
        if (other.getImportInputLocation() == null ^ this.getImportInputLocation() == null)
            return false;
        if (other.getImportInputLocation() != null && other.getImportInputLocation().equals(this.getImportInputLocation()) == false)
            return false;
        if (other.getModality() == null ^ this.getModality() == null)
            return false;
        if (other.getModality() != null && other.getModality().equals(this.getModality()) == false)
            return false;
        if (other.getTestSetTags() == null ^ this.getTestSetTags() == null)
            return false;
        if (other.getTestSetTags() != null && other.getTestSetTags().equals(this.getTestSetTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSetName() == null) ? 0 : getTestSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        hashCode = prime * hashCode + ((getImportInputLocation() == null) ? 0 : getImportInputLocation().hashCode());
        hashCode = prime * hashCode + ((getModality() == null) ? 0 : getModality().hashCode());
        hashCode = prime * hashCode + ((getTestSetTags() == null) ? 0 : getTestSetTags().hashCode());
        return hashCode;
    }

    @Override
    public TestSetImportResourceSpecification clone() {
        try {
            return (TestSetImportResourceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestSetImportResourceSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
