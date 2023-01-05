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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description of the stream's edge configuration that will be used to sync with the Edge Agent IoT Greengrass
 * component. The Edge Agent component will run on an IoT Hub Device setup at your premise.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/EdgeConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     * </p>
     */
    private String hubDeviceArn;
    /**
     * <p>
     * The recorder configuration consists of the local <code>MediaSourceConfig</code> details, that are used as
     * credentials to access the local media files streamed on the camera.
     * </p>
     */
    private RecorderConfig recorderConfig;
    /**
     * <p>
     * The uploader configuration contains the <code>ScheduleExpression</code> details that are used to schedule upload
     * jobs for the recorded media files from the Edge Agent to a Kinesis Video Stream.
     * </p>
     */
    private UploaderConfig uploaderConfig;
    /**
     * <p>
     * The deletion configuration is made up of the retention time (<code>EdgeRetentionInHours</code>) and local size
     * configuration (<code>LocalSizeConfig</code>) details that are used to make the deletion.
     * </p>
     */
    private DeletionConfig deletionConfig;

    /**
     * <p>
     * The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     * </p>
     * 
     * @param hubDeviceArn
     *        The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     */

    public void setHubDeviceArn(String hubDeviceArn) {
        this.hubDeviceArn = hubDeviceArn;
    }

    /**
     * <p>
     * The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     * </p>
     * 
     * @return The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     */

    public String getHubDeviceArn() {
        return this.hubDeviceArn;
    }

    /**
     * <p>
     * The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     * </p>
     * 
     * @param hubDeviceArn
     *        The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeConfig withHubDeviceArn(String hubDeviceArn) {
        setHubDeviceArn(hubDeviceArn);
        return this;
    }

    /**
     * <p>
     * The recorder configuration consists of the local <code>MediaSourceConfig</code> details, that are used as
     * credentials to access the local media files streamed on the camera.
     * </p>
     * 
     * @param recorderConfig
     *        The recorder configuration consists of the local <code>MediaSourceConfig</code> details, that are used as
     *        credentials to access the local media files streamed on the camera.
     */

    public void setRecorderConfig(RecorderConfig recorderConfig) {
        this.recorderConfig = recorderConfig;
    }

    /**
     * <p>
     * The recorder configuration consists of the local <code>MediaSourceConfig</code> details, that are used as
     * credentials to access the local media files streamed on the camera.
     * </p>
     * 
     * @return The recorder configuration consists of the local <code>MediaSourceConfig</code> details, that are used as
     *         credentials to access the local media files streamed on the camera.
     */

    public RecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    /**
     * <p>
     * The recorder configuration consists of the local <code>MediaSourceConfig</code> details, that are used as
     * credentials to access the local media files streamed on the camera.
     * </p>
     * 
     * @param recorderConfig
     *        The recorder configuration consists of the local <code>MediaSourceConfig</code> details, that are used as
     *        credentials to access the local media files streamed on the camera.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeConfig withRecorderConfig(RecorderConfig recorderConfig) {
        setRecorderConfig(recorderConfig);
        return this;
    }

    /**
     * <p>
     * The uploader configuration contains the <code>ScheduleExpression</code> details that are used to schedule upload
     * jobs for the recorded media files from the Edge Agent to a Kinesis Video Stream.
     * </p>
     * 
     * @param uploaderConfig
     *        The uploader configuration contains the <code>ScheduleExpression</code> details that are used to schedule
     *        upload jobs for the recorded media files from the Edge Agent to a Kinesis Video Stream.
     */

    public void setUploaderConfig(UploaderConfig uploaderConfig) {
        this.uploaderConfig = uploaderConfig;
    }

    /**
     * <p>
     * The uploader configuration contains the <code>ScheduleExpression</code> details that are used to schedule upload
     * jobs for the recorded media files from the Edge Agent to a Kinesis Video Stream.
     * </p>
     * 
     * @return The uploader configuration contains the <code>ScheduleExpression</code> details that are used to schedule
     *         upload jobs for the recorded media files from the Edge Agent to a Kinesis Video Stream.
     */

    public UploaderConfig getUploaderConfig() {
        return this.uploaderConfig;
    }

    /**
     * <p>
     * The uploader configuration contains the <code>ScheduleExpression</code> details that are used to schedule upload
     * jobs for the recorded media files from the Edge Agent to a Kinesis Video Stream.
     * </p>
     * 
     * @param uploaderConfig
     *        The uploader configuration contains the <code>ScheduleExpression</code> details that are used to schedule
     *        upload jobs for the recorded media files from the Edge Agent to a Kinesis Video Stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeConfig withUploaderConfig(UploaderConfig uploaderConfig) {
        setUploaderConfig(uploaderConfig);
        return this;
    }

    /**
     * <p>
     * The deletion configuration is made up of the retention time (<code>EdgeRetentionInHours</code>) and local size
     * configuration (<code>LocalSizeConfig</code>) details that are used to make the deletion.
     * </p>
     * 
     * @param deletionConfig
     *        The deletion configuration is made up of the retention time (<code>EdgeRetentionInHours</code>) and local
     *        size configuration (<code>LocalSizeConfig</code>) details that are used to make the deletion.
     */

    public void setDeletionConfig(DeletionConfig deletionConfig) {
        this.deletionConfig = deletionConfig;
    }

    /**
     * <p>
     * The deletion configuration is made up of the retention time (<code>EdgeRetentionInHours</code>) and local size
     * configuration (<code>LocalSizeConfig</code>) details that are used to make the deletion.
     * </p>
     * 
     * @return The deletion configuration is made up of the retention time (<code>EdgeRetentionInHours</code>) and local
     *         size configuration (<code>LocalSizeConfig</code>) details that are used to make the deletion.
     */

    public DeletionConfig getDeletionConfig() {
        return this.deletionConfig;
    }

    /**
     * <p>
     * The deletion configuration is made up of the retention time (<code>EdgeRetentionInHours</code>) and local size
     * configuration (<code>LocalSizeConfig</code>) details that are used to make the deletion.
     * </p>
     * 
     * @param deletionConfig
     *        The deletion configuration is made up of the retention time (<code>EdgeRetentionInHours</code>) and local
     *        size configuration (<code>LocalSizeConfig</code>) details that are used to make the deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeConfig withDeletionConfig(DeletionConfig deletionConfig) {
        setDeletionConfig(deletionConfig);
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
        if (getHubDeviceArn() != null)
            sb.append("HubDeviceArn: ").append(getHubDeviceArn()).append(",");
        if (getRecorderConfig() != null)
            sb.append("RecorderConfig: ").append(getRecorderConfig()).append(",");
        if (getUploaderConfig() != null)
            sb.append("UploaderConfig: ").append(getUploaderConfig()).append(",");
        if (getDeletionConfig() != null)
            sb.append("DeletionConfig: ").append(getDeletionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeConfig == false)
            return false;
        EdgeConfig other = (EdgeConfig) obj;
        if (other.getHubDeviceArn() == null ^ this.getHubDeviceArn() == null)
            return false;
        if (other.getHubDeviceArn() != null && other.getHubDeviceArn().equals(this.getHubDeviceArn()) == false)
            return false;
        if (other.getRecorderConfig() == null ^ this.getRecorderConfig() == null)
            return false;
        if (other.getRecorderConfig() != null && other.getRecorderConfig().equals(this.getRecorderConfig()) == false)
            return false;
        if (other.getUploaderConfig() == null ^ this.getUploaderConfig() == null)
            return false;
        if (other.getUploaderConfig() != null && other.getUploaderConfig().equals(this.getUploaderConfig()) == false)
            return false;
        if (other.getDeletionConfig() == null ^ this.getDeletionConfig() == null)
            return false;
        if (other.getDeletionConfig() != null && other.getDeletionConfig().equals(this.getDeletionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHubDeviceArn() == null) ? 0 : getHubDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getRecorderConfig() == null) ? 0 : getRecorderConfig().hashCode());
        hashCode = prime * hashCode + ((getUploaderConfig() == null) ? 0 : getUploaderConfig().hashCode());
        hashCode = prime * hashCode + ((getDeletionConfig() == null) ? 0 : getDeletionConfig().hashCode());
        return hashCode;
    }

    @Override
    public EdgeConfig clone() {
        try {
            return (EdgeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.EdgeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
