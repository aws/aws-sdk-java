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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartTestSetGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTestSetGenerationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The test set name for the test set generation request.
     * </p>
     */
    private String testSetName;
    /**
     * <p>
     * The test set description for the test set generation request.
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
     * A list of tags to add to the test set. You can only add tags when you import/generate a new test set. You can't
     * use the <code>UpdateTestSet</code> operation to update tags. To update tags, use the <code>TagResource</code>
     * operation.
     * </p>
     */
    private java.util.Map<String, String> testSetTags;

    /**
     * <p>
     * The test set name for the test set generation request.
     * </p>
     * 
     * @param testSetName
     *        The test set name for the test set generation request.
     */

    public void setTestSetName(String testSetName) {
        this.testSetName = testSetName;
    }

    /**
     * <p>
     * The test set name for the test set generation request.
     * </p>
     * 
     * @return The test set name for the test set generation request.
     */

    public String getTestSetName() {
        return this.testSetName;
    }

    /**
     * <p>
     * The test set name for the test set generation request.
     * </p>
     * 
     * @param testSetName
     *        The test set name for the test set generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationRequest withTestSetName(String testSetName) {
        setTestSetName(testSetName);
        return this;
    }

    /**
     * <p>
     * The test set description for the test set generation request.
     * </p>
     * 
     * @param description
     *        The test set description for the test set generation request.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The test set description for the test set generation request.
     * </p>
     * 
     * @return The test set description for the test set generation request.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The test set description for the test set generation request.
     * </p>
     * 
     * @param description
     *        The test set description for the test set generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationRequest withDescription(String description) {
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

    public StartTestSetGenerationRequest withStorageLocation(TestSetStorageLocation storageLocation) {
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

    public StartTestSetGenerationRequest withGenerationDataSource(TestSetGenerationDataSource generationDataSource) {
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

    public StartTestSetGenerationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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

    public StartTestSetGenerationRequest withTestSetTags(java.util.Map<String, String> testSetTags) {
        setTestSetTags(testSetTags);
        return this;
    }

    /**
     * Add a single TestSetTags entry
     *
     * @see StartTestSetGenerationRequest#withTestSetTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartTestSetGenerationRequest addTestSetTagsEntry(String key, String value) {
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

    public StartTestSetGenerationRequest clearTestSetTagsEntries() {
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

        if (obj instanceof StartTestSetGenerationRequest == false)
            return false;
        StartTestSetGenerationRequest other = (StartTestSetGenerationRequest) obj;
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

        hashCode = prime * hashCode + ((getTestSetName() == null) ? 0 : getTestSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        hashCode = prime * hashCode + ((getGenerationDataSource() == null) ? 0 : getGenerationDataSource().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTestSetTags() == null) ? 0 : getTestSetTags().hashCode());
        return hashCode;
    }

    @Override
    public StartTestSetGenerationRequest clone() {
        return (StartTestSetGenerationRequest) super.clone();
    }

}
