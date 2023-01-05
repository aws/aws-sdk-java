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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDetectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the created detector.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * Specifies the data sources that couldn't be enabled when GuardDuty was enabled for the first time.
     * </p>
     */
    private UnprocessedDataSourcesResult unprocessedDataSources;

    /**
     * <p>
     * The unique ID of the created detector.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the created detector.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the created detector.
     * </p>
     * 
     * @return The unique ID of the created detector.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the created detector.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the created detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorResult withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * Specifies the data sources that couldn't be enabled when GuardDuty was enabled for the first time.
     * </p>
     * 
     * @param unprocessedDataSources
     *        Specifies the data sources that couldn't be enabled when GuardDuty was enabled for the first time.
     */

    public void setUnprocessedDataSources(UnprocessedDataSourcesResult unprocessedDataSources) {
        this.unprocessedDataSources = unprocessedDataSources;
    }

    /**
     * <p>
     * Specifies the data sources that couldn't be enabled when GuardDuty was enabled for the first time.
     * </p>
     * 
     * @return Specifies the data sources that couldn't be enabled when GuardDuty was enabled for the first time.
     */

    public UnprocessedDataSourcesResult getUnprocessedDataSources() {
        return this.unprocessedDataSources;
    }

    /**
     * <p>
     * Specifies the data sources that couldn't be enabled when GuardDuty was enabled for the first time.
     * </p>
     * 
     * @param unprocessedDataSources
     *        Specifies the data sources that couldn't be enabled when GuardDuty was enabled for the first time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorResult withUnprocessedDataSources(UnprocessedDataSourcesResult unprocessedDataSources) {
        setUnprocessedDataSources(unprocessedDataSources);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getUnprocessedDataSources() != null)
            sb.append("UnprocessedDataSources: ").append(getUnprocessedDataSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDetectorResult == false)
            return false;
        CreateDetectorResult other = (CreateDetectorResult) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getUnprocessedDataSources() == null ^ this.getUnprocessedDataSources() == null)
            return false;
        if (other.getUnprocessedDataSources() != null && other.getUnprocessedDataSources().equals(this.getUnprocessedDataSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedDataSources() == null) ? 0 : getUnprocessedDataSources().hashCode());
        return hashCode;
    }

    @Override
    public CreateDetectorResult clone() {
        try {
            return (CreateDetectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
