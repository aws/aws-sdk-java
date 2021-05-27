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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeDetectorModelAnalysis"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDetectorModelAnalysisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status of the analysis activity. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> - AWS IoT Events is analyzing your detector model. This process can take several minutes to
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - AWS IoT Events finished analyzing your detector model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - AWS IoT Events couldn't analyze your detector model. Try again later.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The status of the analysis activity. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> - AWS IoT Events is analyzing your detector model. This process can take several minutes to
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - AWS IoT Events finished analyzing your detector model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - AWS IoT Events couldn't analyze your detector model. Try again later.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the analysis activity. The status can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - AWS IoT Events is analyzing your detector model. This process can take several
     *        minutes to complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code> - AWS IoT Events finished analyzing your detector model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - AWS IoT Events couldn't analyze your detector model. Try again later.
     *        </p>
     *        </li>
     * @see AnalysisStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the analysis activity. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> - AWS IoT Events is analyzing your detector model. This process can take several minutes to
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - AWS IoT Events finished analyzing your detector model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - AWS IoT Events couldn't analyze your detector model. Try again later.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the analysis activity. The status can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RUNNING</code> - AWS IoT Events is analyzing your detector model. This process can take several
     *         minutes to complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETE</code> - AWS IoT Events finished analyzing your detector model.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - AWS IoT Events couldn't analyze your detector model. Try again later.
     *         </p>
     *         </li>
     * @see AnalysisStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the analysis activity. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> - AWS IoT Events is analyzing your detector model. This process can take several minutes to
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - AWS IoT Events finished analyzing your detector model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - AWS IoT Events couldn't analyze your detector model. Try again later.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the analysis activity. The status can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - AWS IoT Events is analyzing your detector model. This process can take several
     *        minutes to complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code> - AWS IoT Events finished analyzing your detector model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - AWS IoT Events couldn't analyze your detector model. Try again later.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public DescribeDetectorModelAnalysisResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the analysis activity. The status can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> - AWS IoT Events is analyzing your detector model. This process can take several minutes to
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - AWS IoT Events finished analyzing your detector model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - AWS IoT Events couldn't analyze your detector model. Try again later.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the analysis activity. The status can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - AWS IoT Events is analyzing your detector model. This process can take several
     *        minutes to complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code> - AWS IoT Events finished analyzing your detector model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - AWS IoT Events couldn't analyze your detector model. Try again later.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public DescribeDetectorModelAnalysisResult withStatus(AnalysisStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDetectorModelAnalysisResult == false)
            return false;
        DescribeDetectorModelAnalysisResult other = (DescribeDetectorModelAnalysisResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDetectorModelAnalysisResult clone() {
        try {
            return (DescribeDetectorModelAnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
