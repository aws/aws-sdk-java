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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartTestSetGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTestSetGenerationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the test set generation to describe.
     * </p>
     */
    private String testSetGenerationId;
    /**
     * <p>
     * The creation date and time for the test set generation.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The status for the test set generation.
     * </p>
     */
    private String testSetGenerationStatus;
    /**
     * <p>
     * The test set name used for the test set generation.
     * </p>
     */
    private String testSetName;
    /**
     * <p>
     * The description used for the test set generation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon S3 storage location for the test set generation.
     * </p>
     */
    private TestSetStorageLocation storageLocation;
    /**
     * <p>
     * The data source for the test set generation.
     * </p>
     */
    private TestSetGenerationDataSource generationDataSource;
    /**
     * <p>
     * The roleARN used for any operation in the test set to access resources in the Amazon Web Services account.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of tags that was used for the test set that is being generated.
     * </p>
     */
    private java.util.Map<String, String> testSetTags;

    /**
     * <p>
     * The unique identifier of the test set generation to describe.
     * </p>
     * 
     * @param testSetGenerationId
     *        The unique identifier of the test set generation to describe.
     */

    public void setTestSetGenerationId(String testSetGenerationId) {
        this.testSetGenerationId = testSetGenerationId;
    }

    /**
     * <p>
     * The unique identifier of the test set generation to describe.
     * </p>
     * 
     * @return The unique identifier of the test set generation to describe.
     */

    public String getTestSetGenerationId() {
        return this.testSetGenerationId;
    }

    /**
     * <p>
     * The unique identifier of the test set generation to describe.
     * </p>
     * 
     * @param testSetGenerationId
     *        The unique identifier of the test set generation to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationResult withTestSetGenerationId(String testSetGenerationId) {
        setTestSetGenerationId(testSetGenerationId);
        return this;
    }

    /**
     * <p>
     * The creation date and time for the test set generation.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time for the test set generation.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time for the test set generation.
     * </p>
     * 
     * @return The creation date and time for the test set generation.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time for the test set generation.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The status for the test set generation.
     * </p>
     * 
     * @param testSetGenerationStatus
     *        The status for the test set generation.
     * @see TestSetGenerationStatus
     */

    public void setTestSetGenerationStatus(String testSetGenerationStatus) {
        this.testSetGenerationStatus = testSetGenerationStatus;
    }

    /**
     * <p>
     * The status for the test set generation.
     * </p>
     * 
     * @return The status for the test set generation.
     * @see TestSetGenerationStatus
     */

    public String getTestSetGenerationStatus() {
        return this.testSetGenerationStatus;
    }

    /**
     * <p>
     * The status for the test set generation.
     * </p>
     * 
     * @param testSetGenerationStatus
     *        The status for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSetGenerationStatus
     */

    public StartTestSetGenerationResult withTestSetGenerationStatus(String testSetGenerationStatus) {
        setTestSetGenerationStatus(testSetGenerationStatus);
        return this;
    }

    /**
     * <p>
     * The status for the test set generation.
     * </p>
     * 
     * @param testSetGenerationStatus
     *        The status for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSetGenerationStatus
     */

    public StartTestSetGenerationResult withTestSetGenerationStatus(TestSetGenerationStatus testSetGenerationStatus) {
        this.testSetGenerationStatus = testSetGenerationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The test set name used for the test set generation.
     * </p>
     * 
     * @param testSetName
     *        The test set name used for the test set generation.
     */

    public void setTestSetName(String testSetName) {
        this.testSetName = testSetName;
    }

    /**
     * <p>
     * The test set name used for the test set generation.
     * </p>
     * 
     * @return The test set name used for the test set generation.
     */

    public String getTestSetName() {
        return this.testSetName;
    }

    /**
     * <p>
     * The test set name used for the test set generation.
     * </p>
     * 
     * @param testSetName
     *        The test set name used for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationResult withTestSetName(String testSetName) {
        setTestSetName(testSetName);
        return this;
    }

    /**
     * <p>
     * The description used for the test set generation.
     * </p>
     * 
     * @param description
     *        The description used for the test set generation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description used for the test set generation.
     * </p>
     * 
     * @return The description used for the test set generation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description used for the test set generation.
     * </p>
     * 
     * @param description
     *        The description used for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 storage location for the test set generation.
     * </p>
     * 
     * @param storageLocation
     *        The Amazon S3 storage location for the test set generation.
     */

    public void setStorageLocation(TestSetStorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * The Amazon S3 storage location for the test set generation.
     * </p>
     * 
     * @return The Amazon S3 storage location for the test set generation.
     */

    public TestSetStorageLocation getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * The Amazon S3 storage location for the test set generation.
     * </p>
     * 
     * @param storageLocation
     *        The Amazon S3 storage location for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationResult withStorageLocation(TestSetStorageLocation storageLocation) {
        setStorageLocation(storageLocation);
        return this;
    }

    /**
     * <p>
     * The data source for the test set generation.
     * </p>
     * 
     * @param generationDataSource
     *        The data source for the test set generation.
     */

    public void setGenerationDataSource(TestSetGenerationDataSource generationDataSource) {
        this.generationDataSource = generationDataSource;
    }

    /**
     * <p>
     * The data source for the test set generation.
     * </p>
     * 
     * @return The data source for the test set generation.
     */

    public TestSetGenerationDataSource getGenerationDataSource() {
        return this.generationDataSource;
    }

    /**
     * <p>
     * The data source for the test set generation.
     * </p>
     * 
     * @param generationDataSource
     *        The data source for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationResult withGenerationDataSource(TestSetGenerationDataSource generationDataSource) {
        setGenerationDataSource(generationDataSource);
        return this;
    }

    /**
     * <p>
     * The roleARN used for any operation in the test set to access resources in the Amazon Web Services account.
     * </p>
     * 
     * @param roleArn
     *        The roleARN used for any operation in the test set to access resources in the Amazon Web Services account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The roleARN used for any operation in the test set to access resources in the Amazon Web Services account.
     * </p>
     * 
     * @return The roleARN used for any operation in the test set to access resources in the Amazon Web Services
     *         account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The roleARN used for any operation in the test set to access resources in the Amazon Web Services account.
     * </p>
     * 
     * @param roleArn
     *        The roleARN used for any operation in the test set to access resources in the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of tags that was used for the test set that is being generated.
     * </p>
     * 
     * @return A list of tags that was used for the test set that is being generated.
     */

    public java.util.Map<String, String> getTestSetTags() {
        return testSetTags;
    }

    /**
     * <p>
     * A list of tags that was used for the test set that is being generated.
     * </p>
     * 
     * @param testSetTags
     *        A list of tags that was used for the test set that is being generated.
     */

    public void setTestSetTags(java.util.Map<String, String> testSetTags) {
        this.testSetTags = testSetTags;
    }

    /**
     * <p>
     * A list of tags that was used for the test set that is being generated.
     * </p>
     * 
     * @param testSetTags
     *        A list of tags that was used for the test set that is being generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationResult withTestSetTags(java.util.Map<String, String> testSetTags) {
        setTestSetTags(testSetTags);
        return this;
    }

    /**
     * Add a single TestSetTags entry
     *
     * @see StartTestSetGenerationResult#withTestSetTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationResult addTestSetTagsEntry(String key, String value) {
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

    public StartTestSetGenerationResult clearTestSetTagsEntries() {
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
        if (getTestSetGenerationId() != null)
            sb.append("TestSetGenerationId: ").append(getTestSetGenerationId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getTestSetGenerationStatus() != null)
            sb.append("TestSetGenerationStatus: ").append(getTestSetGenerationStatus()).append(",");
        if (getTestSetName() != null)
            sb.append("TestSetName: ").append(getTestSetName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: ").append(getStorageLocation()).append(",");
        if (getGenerationDataSource() != null)
            sb.append("GenerationDataSource: ").append(getGenerationDataSource()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof StartTestSetGenerationResult == false)
            return false;
        StartTestSetGenerationResult other = (StartTestSetGenerationResult) obj;
        if (other.getTestSetGenerationId() == null ^ this.getTestSetGenerationId() == null)
            return false;
        if (other.getTestSetGenerationId() != null && other.getTestSetGenerationId().equals(this.getTestSetGenerationId()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getTestSetGenerationStatus() == null ^ this.getTestSetGenerationStatus() == null)
            return false;
        if (other.getTestSetGenerationStatus() != null && other.getTestSetGenerationStatus().equals(this.getTestSetGenerationStatus()) == false)
            return false;
        if (other.getTestSetName() == null ^ this.getTestSetName() == null)
            return false;
        if (other.getTestSetName() != null && other.getTestSetName().equals(this.getTestSetName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStorageLocation() == null ^ this.getStorageLocation() == null)
            return false;
        if (other.getStorageLocation() != null && other.getStorageLocation().equals(this.getStorageLocation()) == false)
            return false;
        if (other.getGenerationDataSource() == null ^ this.getGenerationDataSource() == null)
            return false;
        if (other.getGenerationDataSource() != null && other.getGenerationDataSource().equals(this.getGenerationDataSource()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getTestSetGenerationId() == null) ? 0 : getTestSetGenerationId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getTestSetGenerationStatus() == null) ? 0 : getTestSetGenerationStatus().hashCode());
        hashCode = prime * hashCode + ((getTestSetName() == null) ? 0 : getTestSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        hashCode = prime * hashCode + ((getGenerationDataSource() == null) ? 0 : getGenerationDataSource().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTestSetTags() == null) ? 0 : getTestSetTags().hashCode());
        return hashCode;
    }

    @Override
    public StartTestSetGenerationResult clone() {
        try {
            return (StartTestSetGenerationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
