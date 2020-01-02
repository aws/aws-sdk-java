/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container image configuration object for the monitoring job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringAppSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringAppSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container image to be run by the monitoring job.
     * </p>
     */
    private String imageUri;
    /**
     * <p>
     * Specifies the entrypoint for a container used to run the monitoring job.
     * </p>
     */
    private java.util.List<String> containerEntrypoint;
    /**
     * <p>
     * An array of arguments for the container used to run the monitoring job.
     * </p>
     */
    private java.util.List<String> containerArguments;
    /**
     * <p>
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload
     * and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for
     * the built-in (first party) containers.
     * </p>
     */
    private String recordPreprocessorSourceUri;
    /**
     * <p>
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in
     * (first party) containers.
     * </p>
     */
    private String postAnalyticsProcessorSourceUri;

    /**
     * <p>
     * The container image to be run by the monitoring job.
     * </p>
     * 
     * @param imageUri
     *        The container image to be run by the monitoring job.
     */

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    /**
     * <p>
     * The container image to be run by the monitoring job.
     * </p>
     * 
     * @return The container image to be run by the monitoring job.
     */

    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * <p>
     * The container image to be run by the monitoring job.
     * </p>
     * 
     * @param imageUri
     *        The container image to be run by the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAppSpecification withImageUri(String imageUri) {
        setImageUri(imageUri);
        return this;
    }

    /**
     * <p>
     * Specifies the entrypoint for a container used to run the monitoring job.
     * </p>
     * 
     * @return Specifies the entrypoint for a container used to run the monitoring job.
     */

    public java.util.List<String> getContainerEntrypoint() {
        return containerEntrypoint;
    }

    /**
     * <p>
     * Specifies the entrypoint for a container used to run the monitoring job.
     * </p>
     * 
     * @param containerEntrypoint
     *        Specifies the entrypoint for a container used to run the monitoring job.
     */

    public void setContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        if (containerEntrypoint == null) {
            this.containerEntrypoint = null;
            return;
        }

        this.containerEntrypoint = new java.util.ArrayList<String>(containerEntrypoint);
    }

    /**
     * <p>
     * Specifies the entrypoint for a container used to run the monitoring job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerEntrypoint(java.util.Collection)} or {@link #withContainerEntrypoint(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerEntrypoint
     *        Specifies the entrypoint for a container used to run the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAppSpecification withContainerEntrypoint(String... containerEntrypoint) {
        if (this.containerEntrypoint == null) {
            setContainerEntrypoint(new java.util.ArrayList<String>(containerEntrypoint.length));
        }
        for (String ele : containerEntrypoint) {
            this.containerEntrypoint.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the entrypoint for a container used to run the monitoring job.
     * </p>
     * 
     * @param containerEntrypoint
     *        Specifies the entrypoint for a container used to run the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAppSpecification withContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        setContainerEntrypoint(containerEntrypoint);
        return this;
    }

    /**
     * <p>
     * An array of arguments for the container used to run the monitoring job.
     * </p>
     * 
     * @return An array of arguments for the container used to run the monitoring job.
     */

    public java.util.List<String> getContainerArguments() {
        return containerArguments;
    }

    /**
     * <p>
     * An array of arguments for the container used to run the monitoring job.
     * </p>
     * 
     * @param containerArguments
     *        An array of arguments for the container used to run the monitoring job.
     */

    public void setContainerArguments(java.util.Collection<String> containerArguments) {
        if (containerArguments == null) {
            this.containerArguments = null;
            return;
        }

        this.containerArguments = new java.util.ArrayList<String>(containerArguments);
    }

    /**
     * <p>
     * An array of arguments for the container used to run the monitoring job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerArguments(java.util.Collection)} or {@link #withContainerArguments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param containerArguments
     *        An array of arguments for the container used to run the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAppSpecification withContainerArguments(String... containerArguments) {
        if (this.containerArguments == null) {
            setContainerArguments(new java.util.ArrayList<String>(containerArguments.length));
        }
        for (String ele : containerArguments) {
            this.containerArguments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of arguments for the container used to run the monitoring job.
     * </p>
     * 
     * @param containerArguments
     *        An array of arguments for the container used to run the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAppSpecification withContainerArguments(java.util.Collection<String> containerArguments) {
        setContainerArguments(containerArguments);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload
     * and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for
     * the built-in (first party) containers.
     * </p>
     * 
     * @param recordPreprocessorSourceUri
     *        An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the
     *        payload and convert it into a flatted json so that the built-in container can use the converted data.
     *        Applicable only for the built-in (first party) containers.
     */

    public void setRecordPreprocessorSourceUri(String recordPreprocessorSourceUri) {
        this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload
     * and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for
     * the built-in (first party) containers.
     * </p>
     * 
     * @return An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the
     *         payload and convert it into a flatted json so that the built-in container can use the converted data.
     *         Applicable only for the built-in (first party) containers.
     */

    public String getRecordPreprocessorSourceUri() {
        return this.recordPreprocessorSourceUri;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload
     * and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for
     * the built-in (first party) containers.
     * </p>
     * 
     * @param recordPreprocessorSourceUri
     *        An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the
     *        payload and convert it into a flatted json so that the built-in container can use the converted data.
     *        Applicable only for the built-in (first party) containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAppSpecification withRecordPreprocessorSourceUri(String recordPreprocessorSourceUri) {
        setRecordPreprocessorSourceUri(recordPreprocessorSourceUri);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in
     * (first party) containers.
     * </p>
     * 
     * @param postAnalyticsProcessorSourceUri
     *        An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the
     *        built-in (first party) containers.
     */

    public void setPostAnalyticsProcessorSourceUri(String postAnalyticsProcessorSourceUri) {
        this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in
     * (first party) containers.
     * </p>
     * 
     * @return An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the
     *         built-in (first party) containers.
     */

    public String getPostAnalyticsProcessorSourceUri() {
        return this.postAnalyticsProcessorSourceUri;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in
     * (first party) containers.
     * </p>
     * 
     * @param postAnalyticsProcessorSourceUri
     *        An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the
     *        built-in (first party) containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAppSpecification withPostAnalyticsProcessorSourceUri(String postAnalyticsProcessorSourceUri) {
        setPostAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri);
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
        if (getImageUri() != null)
            sb.append("ImageUri: ").append(getImageUri()).append(",");
        if (getContainerEntrypoint() != null)
            sb.append("ContainerEntrypoint: ").append(getContainerEntrypoint()).append(",");
        if (getContainerArguments() != null)
            sb.append("ContainerArguments: ").append(getContainerArguments()).append(",");
        if (getRecordPreprocessorSourceUri() != null)
            sb.append("RecordPreprocessorSourceUri: ").append(getRecordPreprocessorSourceUri()).append(",");
        if (getPostAnalyticsProcessorSourceUri() != null)
            sb.append("PostAnalyticsProcessorSourceUri: ").append(getPostAnalyticsProcessorSourceUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringAppSpecification == false)
            return false;
        MonitoringAppSpecification other = (MonitoringAppSpecification) obj;
        if (other.getImageUri() == null ^ this.getImageUri() == null)
            return false;
        if (other.getImageUri() != null && other.getImageUri().equals(this.getImageUri()) == false)
            return false;
        if (other.getContainerEntrypoint() == null ^ this.getContainerEntrypoint() == null)
            return false;
        if (other.getContainerEntrypoint() != null && other.getContainerEntrypoint().equals(this.getContainerEntrypoint()) == false)
            return false;
        if (other.getContainerArguments() == null ^ this.getContainerArguments() == null)
            return false;
        if (other.getContainerArguments() != null && other.getContainerArguments().equals(this.getContainerArguments()) == false)
            return false;
        if (other.getRecordPreprocessorSourceUri() == null ^ this.getRecordPreprocessorSourceUri() == null)
            return false;
        if (other.getRecordPreprocessorSourceUri() != null && other.getRecordPreprocessorSourceUri().equals(this.getRecordPreprocessorSourceUri()) == false)
            return false;
        if (other.getPostAnalyticsProcessorSourceUri() == null ^ this.getPostAnalyticsProcessorSourceUri() == null)
            return false;
        if (other.getPostAnalyticsProcessorSourceUri() != null
                && other.getPostAnalyticsProcessorSourceUri().equals(this.getPostAnalyticsProcessorSourceUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageUri() == null) ? 0 : getImageUri().hashCode());
        hashCode = prime * hashCode + ((getContainerEntrypoint() == null) ? 0 : getContainerEntrypoint().hashCode());
        hashCode = prime * hashCode + ((getContainerArguments() == null) ? 0 : getContainerArguments().hashCode());
        hashCode = prime * hashCode + ((getRecordPreprocessorSourceUri() == null) ? 0 : getRecordPreprocessorSourceUri().hashCode());
        hashCode = prime * hashCode + ((getPostAnalyticsProcessorSourceUri() == null) ? 0 : getPostAnalyticsProcessorSourceUri().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringAppSpecification clone() {
        try {
            return (MonitoringAppSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringAppSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
