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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of the analysis status of the application component.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ApplicationComponentStatusSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationComponentStatusSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of application components successfully analyzed, partially successful or failed analysis.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The status of database analysis.
     * </p>
     */
    private String srcCodeOrDbAnalysisStatus;

    /**
     * <p>
     * The number of application components successfully analyzed, partially successful or failed analysis.
     * </p>
     * 
     * @param count
     *        The number of application components successfully analyzed, partially successful or failed analysis.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of application components successfully analyzed, partially successful or failed analysis.
     * </p>
     * 
     * @return The number of application components successfully analyzed, partially successful or failed analysis.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of application components successfully analyzed, partially successful or failed analysis.
     * </p>
     * 
     * @param count
     *        The number of application components successfully analyzed, partially successful or failed analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentStatusSummary withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The status of database analysis.
     * </p>
     * 
     * @param srcCodeOrDbAnalysisStatus
     *        The status of database analysis.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public void setSrcCodeOrDbAnalysisStatus(String srcCodeOrDbAnalysisStatus) {
        this.srcCodeOrDbAnalysisStatus = srcCodeOrDbAnalysisStatus;
    }

    /**
     * <p>
     * The status of database analysis.
     * </p>
     * 
     * @return The status of database analysis.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public String getSrcCodeOrDbAnalysisStatus() {
        return this.srcCodeOrDbAnalysisStatus;
    }

    /**
     * <p>
     * The status of database analysis.
     * </p>
     * 
     * @param srcCodeOrDbAnalysisStatus
     *        The status of database analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public ApplicationComponentStatusSummary withSrcCodeOrDbAnalysisStatus(String srcCodeOrDbAnalysisStatus) {
        setSrcCodeOrDbAnalysisStatus(srcCodeOrDbAnalysisStatus);
        return this;
    }

    /**
     * <p>
     * The status of database analysis.
     * </p>
     * 
     * @param srcCodeOrDbAnalysisStatus
     *        The status of database analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public ApplicationComponentStatusSummary withSrcCodeOrDbAnalysisStatus(SrcCodeOrDbAnalysisStatus srcCodeOrDbAnalysisStatus) {
        this.srcCodeOrDbAnalysisStatus = srcCodeOrDbAnalysisStatus.toString();
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getSrcCodeOrDbAnalysisStatus() != null)
            sb.append("SrcCodeOrDbAnalysisStatus: ").append(getSrcCodeOrDbAnalysisStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationComponentStatusSummary == false)
            return false;
        ApplicationComponentStatusSummary other = (ApplicationComponentStatusSummary) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getSrcCodeOrDbAnalysisStatus() == null ^ this.getSrcCodeOrDbAnalysisStatus() == null)
            return false;
        if (other.getSrcCodeOrDbAnalysisStatus() != null && other.getSrcCodeOrDbAnalysisStatus().equals(this.getSrcCodeOrDbAnalysisStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getSrcCodeOrDbAnalysisStatus() == null) ? 0 : getSrcCodeOrDbAnalysisStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationComponentStatusSummary clone() {
        try {
            return (ApplicationComponentStatusSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ApplicationComponentStatusSummaryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
