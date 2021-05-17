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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StartSuiteRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSuiteRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Suite definition Id of the test suite.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * Suite definition version of the test suite.
     * </p>
     */
    private String suiteDefinitionVersion;
    /**
     * <p>
     * Suite run configuration.
     * </p>
     */
    private SuiteRunConfiguration suiteRunConfiguration;
    /**
     * <p>
     * The tags to be attached to the suite run.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Suite definition Id of the test suite.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id of the test suite.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id of the test suite.
     * </p>
     * 
     * @return Suite definition Id of the test suite.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id of the test suite.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSuiteRunRequest withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * Suite definition version of the test suite.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Suite definition version of the test suite.
     */

    public void setSuiteDefinitionVersion(String suiteDefinitionVersion) {
        this.suiteDefinitionVersion = suiteDefinitionVersion;
    }

    /**
     * <p>
     * Suite definition version of the test suite.
     * </p>
     * 
     * @return Suite definition version of the test suite.
     */

    public String getSuiteDefinitionVersion() {
        return this.suiteDefinitionVersion;
    }

    /**
     * <p>
     * Suite definition version of the test suite.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Suite definition version of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSuiteRunRequest withSuiteDefinitionVersion(String suiteDefinitionVersion) {
        setSuiteDefinitionVersion(suiteDefinitionVersion);
        return this;
    }

    /**
     * <p>
     * Suite run configuration.
     * </p>
     * 
     * @param suiteRunConfiguration
     *        Suite run configuration.
     */

    public void setSuiteRunConfiguration(SuiteRunConfiguration suiteRunConfiguration) {
        this.suiteRunConfiguration = suiteRunConfiguration;
    }

    /**
     * <p>
     * Suite run configuration.
     * </p>
     * 
     * @return Suite run configuration.
     */

    public SuiteRunConfiguration getSuiteRunConfiguration() {
        return this.suiteRunConfiguration;
    }

    /**
     * <p>
     * Suite run configuration.
     * </p>
     * 
     * @param suiteRunConfiguration
     *        Suite run configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSuiteRunRequest withSuiteRunConfiguration(SuiteRunConfiguration suiteRunConfiguration) {
        setSuiteRunConfiguration(suiteRunConfiguration);
        return this;
    }

    /**
     * <p>
     * The tags to be attached to the suite run.
     * </p>
     * 
     * @return The tags to be attached to the suite run.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be attached to the suite run.
     * </p>
     * 
     * @param tags
     *        The tags to be attached to the suite run.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be attached to the suite run.
     * </p>
     * 
     * @param tags
     *        The tags to be attached to the suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSuiteRunRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartSuiteRunRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartSuiteRunRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSuiteRunRequest clearTagsEntries() {
        this.tags = null;
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
        if (getSuiteDefinitionVersion() != null)
            sb.append("SuiteDefinitionVersion: ").append(getSuiteDefinitionVersion()).append(",");
        if (getSuiteRunConfiguration() != null)
            sb.append("SuiteRunConfiguration: ").append(getSuiteRunConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSuiteRunRequest == false)
            return false;
        StartSuiteRunRequest other = (StartSuiteRunRequest) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteDefinitionVersion() == null ^ this.getSuiteDefinitionVersion() == null)
            return false;
        if (other.getSuiteDefinitionVersion() != null && other.getSuiteDefinitionVersion().equals(this.getSuiteDefinitionVersion()) == false)
            return false;
        if (other.getSuiteRunConfiguration() == null ^ this.getSuiteRunConfiguration() == null)
            return false;
        if (other.getSuiteRunConfiguration() != null && other.getSuiteRunConfiguration().equals(this.getSuiteRunConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionVersion() == null) ? 0 : getSuiteDefinitionVersion().hashCode());
        hashCode = prime * hashCode + ((getSuiteRunConfiguration() == null) ? 0 : getSuiteRunConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartSuiteRunRequest clone() {
        return (StartSuiteRunRequest) super.clone();
    }

}
