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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A hosted endpoint for real-time inference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Endpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Endpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The endpoint configuration associated with the endpoint.
     * </p>
     */
    private String endpointConfigName;
    /**
     * <p>
     * A list of the production variants hosted on the endpoint. Each production variant is a model.
     * </p>
     */
    private java.util.List<ProductionVariantSummary> productionVariants;

    private DataCaptureConfigSummary dataCaptureConfig;
    /**
     * <p>
     * The status of the endpoint.
     * </p>
     */
    private String endpointStatus;
    /**
     * <p>
     * If the endpoint failed, the reason it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The time that the endpoint was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the endpoint was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * A list of monitoring schedules for the endpoint. For information about model monitoring, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model Monitor</a>.
     * </p>
     */
    private java.util.List<MonitoringSchedule> monitoringSchedules;
    /**
     * <p>
     * A list of the tags associated with the endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @return The name of the endpoint.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The endpoint configuration associated with the endpoint.
     * </p>
     * 
     * @param endpointConfigName
     *        The endpoint configuration associated with the endpoint.
     */

    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The endpoint configuration associated with the endpoint.
     * </p>
     * 
     * @return The endpoint configuration associated with the endpoint.
     */

    public String getEndpointConfigName() {
        return this.endpointConfigName;
    }

    /**
     * <p>
     * The endpoint configuration associated with the endpoint.
     * </p>
     * 
     * @param endpointConfigName
     *        The endpoint configuration associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEndpointConfigName(String endpointConfigName) {
        setEndpointConfigName(endpointConfigName);
        return this;
    }

    /**
     * <p>
     * A list of the production variants hosted on the endpoint. Each production variant is a model.
     * </p>
     * 
     * @return A list of the production variants hosted on the endpoint. Each production variant is a model.
     */

    public java.util.List<ProductionVariantSummary> getProductionVariants() {
        return productionVariants;
    }

    /**
     * <p>
     * A list of the production variants hosted on the endpoint. Each production variant is a model.
     * </p>
     * 
     * @param productionVariants
     *        A list of the production variants hosted on the endpoint. Each production variant is a model.
     */

    public void setProductionVariants(java.util.Collection<ProductionVariantSummary> productionVariants) {
        if (productionVariants == null) {
            this.productionVariants = null;
            return;
        }

        this.productionVariants = new java.util.ArrayList<ProductionVariantSummary>(productionVariants);
    }

    /**
     * <p>
     * A list of the production variants hosted on the endpoint. Each production variant is a model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductionVariants(java.util.Collection)} or {@link #withProductionVariants(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param productionVariants
     *        A list of the production variants hosted on the endpoint. Each production variant is a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withProductionVariants(ProductionVariantSummary... productionVariants) {
        if (this.productionVariants == null) {
            setProductionVariants(new java.util.ArrayList<ProductionVariantSummary>(productionVariants.length));
        }
        for (ProductionVariantSummary ele : productionVariants) {
            this.productionVariants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the production variants hosted on the endpoint. Each production variant is a model.
     * </p>
     * 
     * @param productionVariants
     *        A list of the production variants hosted on the endpoint. Each production variant is a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withProductionVariants(java.util.Collection<ProductionVariantSummary> productionVariants) {
        setProductionVariants(productionVariants);
        return this;
    }

    /**
     * @param dataCaptureConfig
     */

    public void setDataCaptureConfig(DataCaptureConfigSummary dataCaptureConfig) {
        this.dataCaptureConfig = dataCaptureConfig;
    }

    /**
     * @return
     */

    public DataCaptureConfigSummary getDataCaptureConfig() {
        return this.dataCaptureConfig;
    }

    /**
     * @param dataCaptureConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withDataCaptureConfig(DataCaptureConfigSummary dataCaptureConfig) {
        setDataCaptureConfig(dataCaptureConfig);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint.
     * @see EndpointStatus
     */

    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @return The status of the endpoint.
     * @see EndpointStatus
     */

    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public Endpoint withEndpointStatus(String endpointStatus) {
        setEndpointStatus(endpointStatus);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public Endpoint withEndpointStatus(EndpointStatus endpointStatus) {
        this.endpointStatus = endpointStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the endpoint failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the endpoint failed, the reason it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the endpoint failed, the reason it failed.
     * </p>
     * 
     * @return If the endpoint failed, the reason it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the endpoint failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the endpoint failed, the reason it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The time that the endpoint was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the endpoint was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the endpoint was created.
     * </p>
     * 
     * @return The time that the endpoint was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the endpoint was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the endpoint was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the endpoint was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time the endpoint was modified.
     * </p>
     * 
     * @return The last time the endpoint was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time the endpoint was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the endpoint was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * A list of monitoring schedules for the endpoint. For information about model monitoring, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model Monitor</a>.
     * </p>
     * 
     * @return A list of monitoring schedules for the endpoint. For information about model monitoring, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model
     *         Monitor</a>.
     */

    public java.util.List<MonitoringSchedule> getMonitoringSchedules() {
        return monitoringSchedules;
    }

    /**
     * <p>
     * A list of monitoring schedules for the endpoint. For information about model monitoring, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model Monitor</a>.
     * </p>
     * 
     * @param monitoringSchedules
     *        A list of monitoring schedules for the endpoint. For information about model monitoring, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model
     *        Monitor</a>.
     */

    public void setMonitoringSchedules(java.util.Collection<MonitoringSchedule> monitoringSchedules) {
        if (monitoringSchedules == null) {
            this.monitoringSchedules = null;
            return;
        }

        this.monitoringSchedules = new java.util.ArrayList<MonitoringSchedule>(monitoringSchedules);
    }

    /**
     * <p>
     * A list of monitoring schedules for the endpoint. For information about model monitoring, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model Monitor</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitoringSchedules(java.util.Collection)} or {@link #withMonitoringSchedules(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param monitoringSchedules
     *        A list of monitoring schedules for the endpoint. For information about model monitoring, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model
     *        Monitor</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withMonitoringSchedules(MonitoringSchedule... monitoringSchedules) {
        if (this.monitoringSchedules == null) {
            setMonitoringSchedules(new java.util.ArrayList<MonitoringSchedule>(monitoringSchedules.length));
        }
        for (MonitoringSchedule ele : monitoringSchedules) {
            this.monitoringSchedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of monitoring schedules for the endpoint. For information about model monitoring, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model Monitor</a>.
     * </p>
     * 
     * @param monitoringSchedules
     *        A list of monitoring schedules for the endpoint. For information about model monitoring, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html">Amazon SageMaker Model
     *        Monitor</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withMonitoringSchedules(java.util.Collection<MonitoringSchedule> monitoringSchedules) {
        setMonitoringSchedules(monitoringSchedules);
        return this;
    }

    /**
     * <p>
     * A list of the tags associated with the endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @return A list of the tags associated with the endpoint. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tags associated with the endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of the tags associated with the endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of the tags associated with the endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tags associated with the endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tags associated with the endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of the tags associated with the endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: ").append(getEndpointConfigName()).append(",");
        if (getProductionVariants() != null)
            sb.append("ProductionVariants: ").append(getProductionVariants()).append(",");
        if (getDataCaptureConfig() != null)
            sb.append("DataCaptureConfig: ").append(getDataCaptureConfig()).append(",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: ").append(getEndpointStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getMonitoringSchedules() != null)
            sb.append("MonitoringSchedules: ").append(getMonitoringSchedules()).append(",");
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

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getProductionVariants() == null ^ this.getProductionVariants() == null)
            return false;
        if (other.getProductionVariants() != null && other.getProductionVariants().equals(this.getProductionVariants()) == false)
            return false;
        if (other.getDataCaptureConfig() == null ^ this.getDataCaptureConfig() == null)
            return false;
        if (other.getDataCaptureConfig() != null && other.getDataCaptureConfig().equals(this.getDataCaptureConfig()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getMonitoringSchedules() == null ^ this.getMonitoringSchedules() == null)
            return false;
        if (other.getMonitoringSchedules() != null && other.getMonitoringSchedules().equals(this.getMonitoringSchedules()) == false)
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

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode + ((getProductionVariants() == null) ? 0 : getProductionVariants().hashCode());
        hashCode = prime * hashCode + ((getDataCaptureConfig() == null) ? 0 : getDataCaptureConfig().hashCode());
        hashCode = prime * hashCode + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getMonitoringSchedules() == null) ? 0 : getMonitoringSchedules().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Endpoint clone() {
        try {
            return (Endpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
