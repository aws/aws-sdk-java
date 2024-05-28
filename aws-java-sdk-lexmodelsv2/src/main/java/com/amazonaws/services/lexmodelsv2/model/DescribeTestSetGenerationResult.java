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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestSetGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTestSetGenerationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the test set generation.
     * </p>
     */
    private String testSetGenerationId;
    /**
     * <p>
     * The status for the test set generation.
     * </p>
     */
    private String testSetGenerationStatus;
    /**
     * <p>
     * The reasons the test set generation failed.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * The unique identifier for the test set created for the generated test set.
     * </p>
     */
    private String testSetId;
    /**
     * <p>
     * The test set name for the generated test set.
     * </p>
     */
    private String testSetName;
    /**
     * <p>
     * The test set description for the test set generation.
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
     * The data source of the test set used for the test set generation.
     * </p>
     */
    private TestSetGenerationDataSource generationDataSource;
    /**
     * <p>
     * The roleARN of the test set used for the test set generation.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The creation date and time for the test set generation.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time of the last update for the test set generation.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier of the test set generation.
     * </p>
     * 
     * @param testSetGenerationId
     *        The unique identifier of the test set generation.
     */

    public void setTestSetGenerationId(String testSetGenerationId) {
        this.testSetGenerationId = testSetGenerationId;
    }

    /**
     * <p>
     * The unique identifier of the test set generation.
     * </p>
     * 
     * @return The unique identifier of the test set generation.
     */

    public String getTestSetGenerationId() {
        return this.testSetGenerationId;
    }

    /**
     * <p>
     * The unique identifier of the test set generation.
     * </p>
     * 
     * @param testSetGenerationId
     *        The unique identifier of the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetGenerationResult withTestSetGenerationId(String testSetGenerationId) {
        setTestSetGenerationId(testSetGenerationId);
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

    public DescribeTestSetGenerationResult withTestSetGenerationStatus(String testSetGenerationStatus) {
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

    public DescribeTestSetGenerationResult withTestSetGenerationStatus(TestSetGenerationStatus testSetGenerationStatus) {
        this.testSetGenerationStatus = testSetGenerationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reasons the test set generation failed.
     * </p>
     * 
     * @return The reasons the test set generation failed.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * The reasons the test set generation failed.
     * </p>
     * 
     * @param failureReasons
     *        The reasons the test set generation failed.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * The reasons the test set generation failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        The reasons the test set generation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetGenerationResult withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reasons the test set generation failed.
     * </p>
     * 
     * @param failureReasons
     *        The reasons the test set generation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetGenerationResult withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the test set created for the generated test set.
     * </p>
     * 
     * @param testSetId
     *        The unique identifier for the test set created for the generated test set.
     */

    public void setTestSetId(String testSetId) {
        this.testSetId = testSetId;
    }

    /**
     * <p>
     * The unique identifier for the test set created for the generated test set.
     * </p>
     * 
     * @return The unique identifier for the test set created for the generated test set.
     */

    public String getTestSetId() {
        return this.testSetId;
    }

    /**
     * <p>
     * The unique identifier for the test set created for the generated test set.
     * </p>
     * 
     * @param testSetId
     *        The unique identifier for the test set created for the generated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetGenerationResult withTestSetId(String testSetId) {
        setTestSetId(testSetId);
        return this;
    }

    /**
     * <p>
     * The test set name for the generated test set.
     * </p>
     * 
     * @param testSetName
     *        The test set name for the generated test set.
     */

    public void setTestSetName(String testSetName) {
        this.testSetName = testSetName;
    }

    /**
     * <p>
     * The test set name for the generated test set.
     * </p>
     * 
     * @return The test set name for the generated test set.
     */

    public String getTestSetName() {
        return this.testSetName;
    }

    /**
     * <p>
     * The test set name for the generated test set.
     * </p>
     * 
     * @param testSetName
     *        The test set name for the generated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetGenerationResult withTestSetName(String testSetName) {
        setTestSetName(testSetName);
        return this;
    }

    /**
     * <p>
     * The test set description for the test set generation.
     * </p>
     * 
     * @param description
     *        The test set description for the test set generation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The test set description for the test set generation.
     * </p>
     * 
     * @return The test set description for the test set generation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The test set description for the test set generation.
     * </p>
     * 
     * @param description
     *        The test set description for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetGenerationResult withDescription(String description) {
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

    public DescribeTestSetGenerationResult withStorageLocation(TestSetStorageLocation storageLocation) {
        setStorageLocation(storageLocation);
        return this;
    }

    /**
     * <p>
     * The data source of the test set used for the test set generation.
     * </p>
     * 
     * @param generationDataSource
     *        The data source of the test set used for the test set generation.
     */

    public void setGenerationDataSource(TestSetGenerationDataSource generationDataSource) {
        this.generationDataSource = generationDataSource;
    }

    /**
     * <p>
     * The data source of the test set used for the test set generation.
     * </p>
     * 
     * @return The data source of the test set used for the test set generation.
     */

    public TestSetGenerationDataSource getGenerationDataSource() {
        return this.generationDataSource;
    }

    /**
     * <p>
     * The data source of the test set used for the test set generation.
     * </p>
     * 
     * @param generationDataSource
     *        The data source of the test set used for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetGenerationResult withGenerationDataSource(TestSetGenerationDataSource generationDataSource) {
        setGenerationDataSource(generationDataSource);
        return this;
    }

    /**
     * <p>
     * The roleARN of the test set used for the test set generation.
     * </p>
     * 
     * @param roleArn
     *        The roleARN of the test set used for the test set generation.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The roleARN of the test set used for the test set generation.
     * </p>
     * 
     * @return The roleARN of the test set used for the test set generation.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The roleARN of the test set used for the test set generation.
     * </p>
     * 
     * @param roleArn
     *        The roleARN of the test set used for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetGenerationResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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

    public DescribeTestSetGenerationResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time of the last update for the test set generation.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time of the last update for the test set generation.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time of the last update for the test set generation.
     * </p>
     * 
     * @return The date and time of the last update for the test set generation.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time of the last update for the test set generation.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time of the last update for the test set generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestSetGenerationResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getTestSetGenerationStatus() != null)
            sb.append("TestSetGenerationStatus: ").append(getTestSetGenerationStatus()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getTestSetId() != null)
            sb.append("TestSetId: ").append(getTestSetId()).append(",");
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
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTestSetGenerationResult == false)
            return false;
        DescribeTestSetGenerationResult other = (DescribeTestSetGenerationResult) obj;
        if (other.getTestSetGenerationId() == null ^ this.getTestSetGenerationId() == null)
            return false;
        if (other.getTestSetGenerationId() != null && other.getTestSetGenerationId().equals(this.getTestSetGenerationId()) == false)
            return false;
        if (other.getTestSetGenerationStatus() == null ^ this.getTestSetGenerationStatus() == null)
            return false;
        if (other.getTestSetGenerationStatus() != null && other.getTestSetGenerationStatus().equals(this.getTestSetGenerationStatus()) == false)
            return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
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
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSetGenerationId() == null) ? 0 : getTestSetGenerationId().hashCode());
        hashCode = prime * hashCode + ((getTestSetGenerationStatus() == null) ? 0 : getTestSetGenerationStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getTestSetId() == null) ? 0 : getTestSetId().hashCode());
        hashCode = prime * hashCode + ((getTestSetName() == null) ? 0 : getTestSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        hashCode = prime * hashCode + ((getGenerationDataSource() == null) ? 0 : getGenerationDataSource().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTestSetGenerationResult clone() {
        try {
            return (DescribeTestSetGenerationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
