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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object for you to specify your overrides for the recording mode.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/RecordingModeOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordingModeOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description that you provide for the override.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A comma-separated list that specifies which resource types Config includes in the override.
     * </p>
     * <important>
     * <p>
     * Daily recording is not supported for the following resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::Config::ResourceCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConformancePackCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConfigurationRecorder</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;
    /**
     * <p>
     * The recording frequency that will be applied to all the resource types specified in the override.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     * resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall Manager, it
     * is recommended that you set the recording frequency to Continuous.
     * </p>
     * </note>
     */
    private String recordingFrequency;

    /**
     * <p>
     * A description that you provide for the override.
     * </p>
     * 
     * @param description
     *        A description that you provide for the override.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description that you provide for the override.
     * </p>
     * 
     * @return A description that you provide for the override.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description that you provide for the override.
     * </p>
     * 
     * @param description
     *        A description that you provide for the override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingModeOverride withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A comma-separated list that specifies which resource types Config includes in the override.
     * </p>
     * <important>
     * <p>
     * Daily recording is not supported for the following resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::Config::ResourceCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConformancePackCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConfigurationRecorder</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @return A comma-separated list that specifies which resource types Config includes in the override.</p>
     *         <important>
     *         <p>
     *         Daily recording is not supported for the following resource types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS::Config::ResourceCompliance</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::Config::ConformancePackCompliance</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::Config::ConfigurationRecorder</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see ResourceType
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * A comma-separated list that specifies which resource types Config includes in the override.
     * </p>
     * <important>
     * <p>
     * Daily recording is not supported for the following resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::Config::ResourceCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConformancePackCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConfigurationRecorder</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies which resource types Config includes in the override.</p>
     *        <important>
     *        <p>
     *        Daily recording is not supported for the following resource types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ResourceCompliance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ConformancePackCompliance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ConfigurationRecorder</code>
     *        </p>
     *        </li>
     *        </ul>
     * @see ResourceType
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * A comma-separated list that specifies which resource types Config includes in the override.
     * </p>
     * <important>
     * <p>
     * Daily recording is not supported for the following resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::Config::ResourceCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConformancePackCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConfigurationRecorder</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies which resource types Config includes in the override.</p>
     *        <important>
     *        <p>
     *        Daily recording is not supported for the following resource types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ResourceCompliance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ConformancePackCompliance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ConfigurationRecorder</code>
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecordingModeOverride withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A comma-separated list that specifies which resource types Config includes in the override.
     * </p>
     * <important>
     * <p>
     * Daily recording is not supported for the following resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::Config::ResourceCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConformancePackCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConfigurationRecorder</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies which resource types Config includes in the override.</p>
     *        <important>
     *        <p>
     *        Daily recording is not supported for the following resource types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ResourceCompliance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ConformancePackCompliance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ConfigurationRecorder</code>
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecordingModeOverride withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * A comma-separated list that specifies which resource types Config includes in the override.
     * </p>
     * <important>
     * <p>
     * Daily recording is not supported for the following resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::Config::ResourceCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConformancePackCompliance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Config::ConfigurationRecorder</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies which resource types Config includes in the override.</p>
     *        <important>
     *        <p>
     *        Daily recording is not supported for the following resource types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ResourceCompliance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ConformancePackCompliance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Config::ConfigurationRecorder</code>
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecordingModeOverride withResourceTypes(ResourceType... resourceTypes) {
        com.amazonaws.internal.SdkInternalList<String> resourceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length);
        for (ResourceType value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The recording frequency that will be applied to all the resource types specified in the override.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     * resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall Manager, it
     * is recommended that you set the recording frequency to Continuous.
     * </p>
     * </note>
     * 
     * @param recordingFrequency
     *        The recording frequency that will be applied to all the resource types specified in the override.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     *        resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall
     *        Manager, it is recommended that you set the recording frequency to Continuous.
     *        </p>
     * @see RecordingFrequency
     */

    public void setRecordingFrequency(String recordingFrequency) {
        this.recordingFrequency = recordingFrequency;
    }

    /**
     * <p>
     * The recording frequency that will be applied to all the resource types specified in the override.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     * resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall Manager, it
     * is recommended that you set the recording frequency to Continuous.
     * </p>
     * </note>
     * 
     * @return The recording frequency that will be applied to all the resource types specified in the override.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Daily recording allows you to receive a configuration item (CI) representing the most recent state of
     *         your resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall
     *         Manager, it is recommended that you set the recording frequency to Continuous.
     *         </p>
     * @see RecordingFrequency
     */

    public String getRecordingFrequency() {
        return this.recordingFrequency;
    }

    /**
     * <p>
     * The recording frequency that will be applied to all the resource types specified in the override.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     * resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall Manager, it
     * is recommended that you set the recording frequency to Continuous.
     * </p>
     * </note>
     * 
     * @param recordingFrequency
     *        The recording frequency that will be applied to all the resource types specified in the override.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     *        resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall
     *        Manager, it is recommended that you set the recording frequency to Continuous.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingFrequency
     */

    public RecordingModeOverride withRecordingFrequency(String recordingFrequency) {
        setRecordingFrequency(recordingFrequency);
        return this;
    }

    /**
     * <p>
     * The recording frequency that will be applied to all the resource types specified in the override.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     * resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall Manager, it
     * is recommended that you set the recording frequency to Continuous.
     * </p>
     * </note>
     * 
     * @param recordingFrequency
     *        The recording frequency that will be applied to all the resource types specified in the override.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     *        resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall
     *        Manager, it is recommended that you set the recording frequency to Continuous.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingFrequency
     */

    public RecordingModeOverride withRecordingFrequency(RecordingFrequency recordingFrequency) {
        this.recordingFrequency = recordingFrequency.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getRecordingFrequency() != null)
            sb.append("RecordingFrequency: ").append(getRecordingFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordingModeOverride == false)
            return false;
        RecordingModeOverride other = (RecordingModeOverride) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getRecordingFrequency() == null ^ this.getRecordingFrequency() == null)
            return false;
        if (other.getRecordingFrequency() != null && other.getRecordingFrequency().equals(this.getRecordingFrequency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getRecordingFrequency() == null) ? 0 : getRecordingFrequency().hashCode());
        return hashCode;
    }

    @Override
    public RecordingModeOverride clone() {
        try {
            return (RecordingModeOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RecordingModeOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
