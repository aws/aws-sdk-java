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
 * Specifies the default recording frequency that Config uses to record configuration changes. Config supports
 * <i>Continuous recording</i> and <i>Daily recording</i>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Continuous recording allows you to record configuration changes continuously whenever a change occurs.
 * </p>
 * </li>
 * <li>
 * <p>
 * Daily recording allows you to receive a configuration item (CI) representing the most recent state of your resources
 * over the last 24-hour period, only if it’s different from the previous CI recorded.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall Manager, it is
 * recommended that you set the recording frequency to Continuous.
 * </p>
 * </note>
 * <p>
 * You can also override the recording frequency for specific resource types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/RecordingMode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordingMode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default recording frequency that Config uses to record configuration changes.
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
     * <p>
     * For the <b>allSupported</b> (<code>ALL_SUPPORTED_RESOURCE_TYPES</code>) recording strategy, these resource types
     * will be set to Continuous recording.
     * </p>
     * </important>
     */
    private String recordingFrequency;
    /**
     * <p>
     * An array of <code>recordingModeOverride</code> objects for you to specify your overrides for the recording mode.
     * The <code>recordingModeOverride</code> object in the <code>recordingModeOverrides</code> array consists of three
     * fields: a <code>description</code>, the new <code>recordingFrequency</code>, and an array of
     * <code>resourceTypes</code> to override.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecordingModeOverride> recordingModeOverrides;

    /**
     * <p>
     * The default recording frequency that Config uses to record configuration changes.
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
     * <p>
     * For the <b>allSupported</b> (<code>ALL_SUPPORTED_RESOURCE_TYPES</code>) recording strategy, these resource types
     * will be set to Continuous recording.
     * </p>
     * </important>
     * 
     * @param recordingFrequency
     *        The default recording frequency that Config uses to record configuration changes.</p> <important>
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
     *        <p>
     *        For the <b>allSupported</b> (<code>ALL_SUPPORTED_RESOURCE_TYPES</code>) recording strategy, these resource
     *        types will be set to Continuous recording.
     *        </p>
     * @see RecordingFrequency
     */

    public void setRecordingFrequency(String recordingFrequency) {
        this.recordingFrequency = recordingFrequency;
    }

    /**
     * <p>
     * The default recording frequency that Config uses to record configuration changes.
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
     * <p>
     * For the <b>allSupported</b> (<code>ALL_SUPPORTED_RESOURCE_TYPES</code>) recording strategy, these resource types
     * will be set to Continuous recording.
     * </p>
     * </important>
     * 
     * @return The default recording frequency that Config uses to record configuration changes.</p> <important>
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
     *         <p>
     *         For the <b>allSupported</b> (<code>ALL_SUPPORTED_RESOURCE_TYPES</code>) recording strategy, these
     *         resource types will be set to Continuous recording.
     *         </p>
     * @see RecordingFrequency
     */

    public String getRecordingFrequency() {
        return this.recordingFrequency;
    }

    /**
     * <p>
     * The default recording frequency that Config uses to record configuration changes.
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
     * <p>
     * For the <b>allSupported</b> (<code>ALL_SUPPORTED_RESOURCE_TYPES</code>) recording strategy, these resource types
     * will be set to Continuous recording.
     * </p>
     * </important>
     * 
     * @param recordingFrequency
     *        The default recording frequency that Config uses to record configuration changes.</p> <important>
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
     *        <p>
     *        For the <b>allSupported</b> (<code>ALL_SUPPORTED_RESOURCE_TYPES</code>) recording strategy, these resource
     *        types will be set to Continuous recording.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingFrequency
     */

    public RecordingMode withRecordingFrequency(String recordingFrequency) {
        setRecordingFrequency(recordingFrequency);
        return this;
    }

    /**
     * <p>
     * The default recording frequency that Config uses to record configuration changes.
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
     * <p>
     * For the <b>allSupported</b> (<code>ALL_SUPPORTED_RESOURCE_TYPES</code>) recording strategy, these resource types
     * will be set to Continuous recording.
     * </p>
     * </important>
     * 
     * @param recordingFrequency
     *        The default recording frequency that Config uses to record configuration changes.</p> <important>
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
     *        <p>
     *        For the <b>allSupported</b> (<code>ALL_SUPPORTED_RESOURCE_TYPES</code>) recording strategy, these resource
     *        types will be set to Continuous recording.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingFrequency
     */

    public RecordingMode withRecordingFrequency(RecordingFrequency recordingFrequency) {
        this.recordingFrequency = recordingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * An array of <code>recordingModeOverride</code> objects for you to specify your overrides for the recording mode.
     * The <code>recordingModeOverride</code> object in the <code>recordingModeOverrides</code> array consists of three
     * fields: a <code>description</code>, the new <code>recordingFrequency</code>, and an array of
     * <code>resourceTypes</code> to override.
     * </p>
     * 
     * @return An array of <code>recordingModeOverride</code> objects for you to specify your overrides for the
     *         recording mode. The <code>recordingModeOverride</code> object in the <code>recordingModeOverrides</code>
     *         array consists of three fields: a <code>description</code>, the new <code>recordingFrequency</code>, and
     *         an array of <code>resourceTypes</code> to override.
     */

    public java.util.List<RecordingModeOverride> getRecordingModeOverrides() {
        if (recordingModeOverrides == null) {
            recordingModeOverrides = new com.amazonaws.internal.SdkInternalList<RecordingModeOverride>();
        }
        return recordingModeOverrides;
    }

    /**
     * <p>
     * An array of <code>recordingModeOverride</code> objects for you to specify your overrides for the recording mode.
     * The <code>recordingModeOverride</code> object in the <code>recordingModeOverrides</code> array consists of three
     * fields: a <code>description</code>, the new <code>recordingFrequency</code>, and an array of
     * <code>resourceTypes</code> to override.
     * </p>
     * 
     * @param recordingModeOverrides
     *        An array of <code>recordingModeOverride</code> objects for you to specify your overrides for the recording
     *        mode. The <code>recordingModeOverride</code> object in the <code>recordingModeOverrides</code> array
     *        consists of three fields: a <code>description</code>, the new <code>recordingFrequency</code>, and an
     *        array of <code>resourceTypes</code> to override.
     */

    public void setRecordingModeOverrides(java.util.Collection<RecordingModeOverride> recordingModeOverrides) {
        if (recordingModeOverrides == null) {
            this.recordingModeOverrides = null;
            return;
        }

        this.recordingModeOverrides = new com.amazonaws.internal.SdkInternalList<RecordingModeOverride>(recordingModeOverrides);
    }

    /**
     * <p>
     * An array of <code>recordingModeOverride</code> objects for you to specify your overrides for the recording mode.
     * The <code>recordingModeOverride</code> object in the <code>recordingModeOverrides</code> array consists of three
     * fields: a <code>description</code>, the new <code>recordingFrequency</code>, and an array of
     * <code>resourceTypes</code> to override.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordingModeOverrides(java.util.Collection)} or
     * {@link #withRecordingModeOverrides(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recordingModeOverrides
     *        An array of <code>recordingModeOverride</code> objects for you to specify your overrides for the recording
     *        mode. The <code>recordingModeOverride</code> object in the <code>recordingModeOverrides</code> array
     *        consists of three fields: a <code>description</code>, the new <code>recordingFrequency</code>, and an
     *        array of <code>resourceTypes</code> to override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingMode withRecordingModeOverrides(RecordingModeOverride... recordingModeOverrides) {
        if (this.recordingModeOverrides == null) {
            setRecordingModeOverrides(new com.amazonaws.internal.SdkInternalList<RecordingModeOverride>(recordingModeOverrides.length));
        }
        for (RecordingModeOverride ele : recordingModeOverrides) {
            this.recordingModeOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>recordingModeOverride</code> objects for you to specify your overrides for the recording mode.
     * The <code>recordingModeOverride</code> object in the <code>recordingModeOverrides</code> array consists of three
     * fields: a <code>description</code>, the new <code>recordingFrequency</code>, and an array of
     * <code>resourceTypes</code> to override.
     * </p>
     * 
     * @param recordingModeOverrides
     *        An array of <code>recordingModeOverride</code> objects for you to specify your overrides for the recording
     *        mode. The <code>recordingModeOverride</code> object in the <code>recordingModeOverrides</code> array
     *        consists of three fields: a <code>description</code>, the new <code>recordingFrequency</code>, and an
     *        array of <code>resourceTypes</code> to override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingMode withRecordingModeOverrides(java.util.Collection<RecordingModeOverride> recordingModeOverrides) {
        setRecordingModeOverrides(recordingModeOverrides);
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
        if (getRecordingFrequency() != null)
            sb.append("RecordingFrequency: ").append(getRecordingFrequency()).append(",");
        if (getRecordingModeOverrides() != null)
            sb.append("RecordingModeOverrides: ").append(getRecordingModeOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordingMode == false)
            return false;
        RecordingMode other = (RecordingMode) obj;
        if (other.getRecordingFrequency() == null ^ this.getRecordingFrequency() == null)
            return false;
        if (other.getRecordingFrequency() != null && other.getRecordingFrequency().equals(this.getRecordingFrequency()) == false)
            return false;
        if (other.getRecordingModeOverrides() == null ^ this.getRecordingModeOverrides() == null)
            return false;
        if (other.getRecordingModeOverrides() != null && other.getRecordingModeOverrides().equals(this.getRecordingModeOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordingFrequency() == null) ? 0 : getRecordingFrequency().hashCode());
        hashCode = prime * hashCode + ((getRecordingModeOverrides() == null) ? 0 : getRecordingModeOverrides().hashCode());
        return hashCode;
    }

    @Override
    public RecordingMode clone() {
        try {
            return (RecordingMode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RecordingModeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
