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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateTestSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTestSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The test set Id for which update test operation to be performed.
     * </p>
     */
    private String testSetId;
    /**
     * <p>
     * The test set name for the updated test set.
     * </p>
     */
    private String testSetName;
    /**
     * <p>
     * The test set description for the updated test set.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether audio or text is used for the updated test set.
     * </p>
     */
    private String modality;
    /**
     * <p>
     * The status for the updated test set.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The roleARN used for any operation in the test set to access resources in the Amazon Web Services account.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The number of conversation turns from the updated test set.
     * </p>
     */
    private Integer numTurns;
    /**
     * <p>
     * The Amazon S3 storage location for the updated test set.
     * </p>
     */
    private TestSetStorageLocation storageLocation;
    /**
     * <p>
     * The creation date and time for the updated test set.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time of the last update for the updated test set.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

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

    public UpdateTestSetResult withTestSetId(String testSetId) {
        setTestSetId(testSetId);
        return this;
    }

    /**
     * <p>
     * The test set name for the updated test set.
     * </p>
     * 
     * @param testSetName
     *        The test set name for the updated test set.
     */

    public void setTestSetName(String testSetName) {
        this.testSetName = testSetName;
    }

    /**
     * <p>
     * The test set name for the updated test set.
     * </p>
     * 
     * @return The test set name for the updated test set.
     */

    public String getTestSetName() {
        return this.testSetName;
    }

    /**
     * <p>
     * The test set name for the updated test set.
     * </p>
     * 
     * @param testSetName
     *        The test set name for the updated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSetResult withTestSetName(String testSetName) {
        setTestSetName(testSetName);
        return this;
    }

    /**
     * <p>
     * The test set description for the updated test set.
     * </p>
     * 
     * @param description
     *        The test set description for the updated test set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The test set description for the updated test set.
     * </p>
     * 
     * @return The test set description for the updated test set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The test set description for the updated test set.
     * </p>
     * 
     * @param description
     *        The test set description for the updated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSetResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether audio or text is used for the updated test set.
     * </p>
     * 
     * @param modality
     *        Indicates whether audio or text is used for the updated test set.
     * @see TestSetModality
     */

    public void setModality(String modality) {
        this.modality = modality;
    }

    /**
     * <p>
     * Indicates whether audio or text is used for the updated test set.
     * </p>
     * 
     * @return Indicates whether audio or text is used for the updated test set.
     * @see TestSetModality
     */

    public String getModality() {
        return this.modality;
    }

    /**
     * <p>
     * Indicates whether audio or text is used for the updated test set.
     * </p>
     * 
     * @param modality
     *        Indicates whether audio or text is used for the updated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSetModality
     */

    public UpdateTestSetResult withModality(String modality) {
        setModality(modality);
        return this;
    }

    /**
     * <p>
     * Indicates whether audio or text is used for the updated test set.
     * </p>
     * 
     * @param modality
     *        Indicates whether audio or text is used for the updated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSetModality
     */

    public UpdateTestSetResult withModality(TestSetModality modality) {
        this.modality = modality.toString();
        return this;
    }

    /**
     * <p>
     * The status for the updated test set.
     * </p>
     * 
     * @param status
     *        The status for the updated test set.
     * @see TestSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for the updated test set.
     * </p>
     * 
     * @return The status for the updated test set.
     * @see TestSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for the updated test set.
     * </p>
     * 
     * @param status
     *        The status for the updated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSetStatus
     */

    public UpdateTestSetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for the updated test set.
     * </p>
     * 
     * @param status
     *        The status for the updated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSetStatus
     */

    public UpdateTestSetResult withStatus(TestSetStatus status) {
        this.status = status.toString();
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

    public UpdateTestSetResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The number of conversation turns from the updated test set.
     * </p>
     * 
     * @param numTurns
     *        The number of conversation turns from the updated test set.
     */

    public void setNumTurns(Integer numTurns) {
        this.numTurns = numTurns;
    }

    /**
     * <p>
     * The number of conversation turns from the updated test set.
     * </p>
     * 
     * @return The number of conversation turns from the updated test set.
     */

    public Integer getNumTurns() {
        return this.numTurns;
    }

    /**
     * <p>
     * The number of conversation turns from the updated test set.
     * </p>
     * 
     * @param numTurns
     *        The number of conversation turns from the updated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSetResult withNumTurns(Integer numTurns) {
        setNumTurns(numTurns);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 storage location for the updated test set.
     * </p>
     * 
     * @param storageLocation
     *        The Amazon S3 storage location for the updated test set.
     */

    public void setStorageLocation(TestSetStorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * The Amazon S3 storage location for the updated test set.
     * </p>
     * 
     * @return The Amazon S3 storage location for the updated test set.
     */

    public TestSetStorageLocation getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * The Amazon S3 storage location for the updated test set.
     * </p>
     * 
     * @param storageLocation
     *        The Amazon S3 storage location for the updated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSetResult withStorageLocation(TestSetStorageLocation storageLocation) {
        setStorageLocation(storageLocation);
        return this;
    }

    /**
     * <p>
     * The creation date and time for the updated test set.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time for the updated test set.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time for the updated test set.
     * </p>
     * 
     * @return The creation date and time for the updated test set.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time for the updated test set.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time for the updated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSetResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time of the last update for the updated test set.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time of the last update for the updated test set.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time of the last update for the updated test set.
     * </p>
     * 
     * @return The date and time of the last update for the updated test set.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time of the last update for the updated test set.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time of the last update for the updated test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSetResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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
        if (getTestSetId() != null)
            sb.append("TestSetId: ").append(getTestSetId()).append(",");
        if (getTestSetName() != null)
            sb.append("TestSetName: ").append(getTestSetName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getModality() != null)
            sb.append("Modality: ").append(getModality()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getNumTurns() != null)
            sb.append("NumTurns: ").append(getNumTurns()).append(",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: ").append(getStorageLocation()).append(",");
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

        if (obj instanceof UpdateTestSetResult == false)
            return false;
        UpdateTestSetResult other = (UpdateTestSetResult) obj;
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
        if (other.getModality() == null ^ this.getModality() == null)
            return false;
        if (other.getModality() != null && other.getModality().equals(this.getModality()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getNumTurns() == null ^ this.getNumTurns() == null)
            return false;
        if (other.getNumTurns() != null && other.getNumTurns().equals(this.getNumTurns()) == false)
            return false;
        if (other.getStorageLocation() == null ^ this.getStorageLocation() == null)
            return false;
        if (other.getStorageLocation() != null && other.getStorageLocation().equals(this.getStorageLocation()) == false)
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

        hashCode = prime * hashCode + ((getTestSetId() == null) ? 0 : getTestSetId().hashCode());
        hashCode = prime * hashCode + ((getTestSetName() == null) ? 0 : getTestSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getModality() == null) ? 0 : getModality().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNumTurns() == null) ? 0 : getNumTurns().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTestSetResult clone() {
        try {
            return (UpdateTestSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
