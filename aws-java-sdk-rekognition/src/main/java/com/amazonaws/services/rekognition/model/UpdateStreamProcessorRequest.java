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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStreamProcessorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the stream processor that you want to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The stream processor settings that you want to update. Label detection settings can be updated to detect
     * different labels with a different minimum confidence.
     * </p>
     */
    private StreamProcessorSettingsForUpdate settingsForUpdate;
    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an optional
     * parameter for label detection stream processors.
     * </p>
     */
    private java.util.List<RegionOfInterest> regionsOfInterestForUpdate;
    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at
     * the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored
     * on individual streams.
     * </p>
     */
    private StreamProcessorDataSharingPreference dataSharingPreferenceForUpdate;
    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     */
    private java.util.List<String> parametersToDelete;

    /**
     * <p>
     * Name of the stream processor that you want to update.
     * </p>
     * 
     * @param name
     *        Name of the stream processor that you want to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the stream processor that you want to update.
     * </p>
     * 
     * @return Name of the stream processor that you want to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the stream processor that you want to update.
     * </p>
     * 
     * @param name
     *        Name of the stream processor that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamProcessorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The stream processor settings that you want to update. Label detection settings can be updated to detect
     * different labels with a different minimum confidence.
     * </p>
     * 
     * @param settingsForUpdate
     *        The stream processor settings that you want to update. Label detection settings can be updated to detect
     *        different labels with a different minimum confidence.
     */

    public void setSettingsForUpdate(StreamProcessorSettingsForUpdate settingsForUpdate) {
        this.settingsForUpdate = settingsForUpdate;
    }

    /**
     * <p>
     * The stream processor settings that you want to update. Label detection settings can be updated to detect
     * different labels with a different minimum confidence.
     * </p>
     * 
     * @return The stream processor settings that you want to update. Label detection settings can be updated to detect
     *         different labels with a different minimum confidence.
     */

    public StreamProcessorSettingsForUpdate getSettingsForUpdate() {
        return this.settingsForUpdate;
    }

    /**
     * <p>
     * The stream processor settings that you want to update. Label detection settings can be updated to detect
     * different labels with a different minimum confidence.
     * </p>
     * 
     * @param settingsForUpdate
     *        The stream processor settings that you want to update. Label detection settings can be updated to detect
     *        different labels with a different minimum confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamProcessorRequest withSettingsForUpdate(StreamProcessorSettingsForUpdate settingsForUpdate) {
        setSettingsForUpdate(settingsForUpdate);
        return this;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an optional
     * parameter for label detection stream processors.
     * </p>
     * 
     * @return Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an
     *         optional parameter for label detection stream processors.
     */

    public java.util.List<RegionOfInterest> getRegionsOfInterestForUpdate() {
        return regionsOfInterestForUpdate;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an optional
     * parameter for label detection stream processors.
     * </p>
     * 
     * @param regionsOfInterestForUpdate
     *        Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an
     *        optional parameter for label detection stream processors.
     */

    public void setRegionsOfInterestForUpdate(java.util.Collection<RegionOfInterest> regionsOfInterestForUpdate) {
        if (regionsOfInterestForUpdate == null) {
            this.regionsOfInterestForUpdate = null;
            return;
        }

        this.regionsOfInterestForUpdate = new java.util.ArrayList<RegionOfInterest>(regionsOfInterestForUpdate);
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an optional
     * parameter for label detection stream processors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionsOfInterestForUpdate(java.util.Collection)} or
     * {@link #withRegionsOfInterestForUpdate(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param regionsOfInterestForUpdate
     *        Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an
     *        optional parameter for label detection stream processors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamProcessorRequest withRegionsOfInterestForUpdate(RegionOfInterest... regionsOfInterestForUpdate) {
        if (this.regionsOfInterestForUpdate == null) {
            setRegionsOfInterestForUpdate(new java.util.ArrayList<RegionOfInterest>(regionsOfInterestForUpdate.length));
        }
        for (RegionOfInterest ele : regionsOfInterestForUpdate) {
            this.regionsOfInterestForUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an optional
     * parameter for label detection stream processors.
     * </p>
     * 
     * @param regionsOfInterestForUpdate
     *        Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an
     *        optional parameter for label detection stream processors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamProcessorRequest withRegionsOfInterestForUpdate(java.util.Collection<RegionOfInterest> regionsOfInterestForUpdate) {
        setRegionsOfInterestForUpdate(regionsOfInterestForUpdate);
        return this;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at
     * the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored
     * on individual streams.
     * </p>
     * 
     * @param dataSharingPreferenceForUpdate
     *        Shows whether you are sharing data with Rekognition to improve model performance. You can choose this
     *        option at the account level or on a per-stream basis. Note that if you opt out at the account level this
     *        setting is ignored on individual streams.
     */

    public void setDataSharingPreferenceForUpdate(StreamProcessorDataSharingPreference dataSharingPreferenceForUpdate) {
        this.dataSharingPreferenceForUpdate = dataSharingPreferenceForUpdate;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at
     * the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored
     * on individual streams.
     * </p>
     * 
     * @return Shows whether you are sharing data with Rekognition to improve model performance. You can choose this
     *         option at the account level or on a per-stream basis. Note that if you opt out at the account level this
     *         setting is ignored on individual streams.
     */

    public StreamProcessorDataSharingPreference getDataSharingPreferenceForUpdate() {
        return this.dataSharingPreferenceForUpdate;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at
     * the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored
     * on individual streams.
     * </p>
     * 
     * @param dataSharingPreferenceForUpdate
     *        Shows whether you are sharing data with Rekognition to improve model performance. You can choose this
     *        option at the account level or on a per-stream basis. Note that if you opt out at the account level this
     *        setting is ignored on individual streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamProcessorRequest withDataSharingPreferenceForUpdate(StreamProcessorDataSharingPreference dataSharingPreferenceForUpdate) {
        setDataSharingPreferenceForUpdate(dataSharingPreferenceForUpdate);
        return this;
    }

    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     * 
     * @return A list of parameters you want to delete from the stream processor.
     * @see StreamProcessorParameterToDelete
     */

    public java.util.List<String> getParametersToDelete() {
        return parametersToDelete;
    }

    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     * 
     * @param parametersToDelete
     *        A list of parameters you want to delete from the stream processor.
     * @see StreamProcessorParameterToDelete
     */

    public void setParametersToDelete(java.util.Collection<String> parametersToDelete) {
        if (parametersToDelete == null) {
            this.parametersToDelete = null;
            return;
        }

        this.parametersToDelete = new java.util.ArrayList<String>(parametersToDelete);
    }

    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParametersToDelete(java.util.Collection)} or {@link #withParametersToDelete(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param parametersToDelete
     *        A list of parameters you want to delete from the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamProcessorParameterToDelete
     */

    public UpdateStreamProcessorRequest withParametersToDelete(String... parametersToDelete) {
        if (this.parametersToDelete == null) {
            setParametersToDelete(new java.util.ArrayList<String>(parametersToDelete.length));
        }
        for (String ele : parametersToDelete) {
            this.parametersToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     * 
     * @param parametersToDelete
     *        A list of parameters you want to delete from the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamProcessorParameterToDelete
     */

    public UpdateStreamProcessorRequest withParametersToDelete(java.util.Collection<String> parametersToDelete) {
        setParametersToDelete(parametersToDelete);
        return this;
    }

    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     * 
     * @param parametersToDelete
     *        A list of parameters you want to delete from the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamProcessorParameterToDelete
     */

    public UpdateStreamProcessorRequest withParametersToDelete(StreamProcessorParameterToDelete... parametersToDelete) {
        java.util.ArrayList<String> parametersToDeleteCopy = new java.util.ArrayList<String>(parametersToDelete.length);
        for (StreamProcessorParameterToDelete value : parametersToDelete) {
            parametersToDeleteCopy.add(value.toString());
        }
        if (getParametersToDelete() == null) {
            setParametersToDelete(parametersToDeleteCopy);
        } else {
            getParametersToDelete().addAll(parametersToDeleteCopy);
        }
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSettingsForUpdate() != null)
            sb.append("SettingsForUpdate: ").append(getSettingsForUpdate()).append(",");
        if (getRegionsOfInterestForUpdate() != null)
            sb.append("RegionsOfInterestForUpdate: ").append(getRegionsOfInterestForUpdate()).append(",");
        if (getDataSharingPreferenceForUpdate() != null)
            sb.append("DataSharingPreferenceForUpdate: ").append(getDataSharingPreferenceForUpdate()).append(",");
        if (getParametersToDelete() != null)
            sb.append("ParametersToDelete: ").append(getParametersToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStreamProcessorRequest == false)
            return false;
        UpdateStreamProcessorRequest other = (UpdateStreamProcessorRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSettingsForUpdate() == null ^ this.getSettingsForUpdate() == null)
            return false;
        if (other.getSettingsForUpdate() != null && other.getSettingsForUpdate().equals(this.getSettingsForUpdate()) == false)
            return false;
        if (other.getRegionsOfInterestForUpdate() == null ^ this.getRegionsOfInterestForUpdate() == null)
            return false;
        if (other.getRegionsOfInterestForUpdate() != null && other.getRegionsOfInterestForUpdate().equals(this.getRegionsOfInterestForUpdate()) == false)
            return false;
        if (other.getDataSharingPreferenceForUpdate() == null ^ this.getDataSharingPreferenceForUpdate() == null)
            return false;
        if (other.getDataSharingPreferenceForUpdate() != null
                && other.getDataSharingPreferenceForUpdate().equals(this.getDataSharingPreferenceForUpdate()) == false)
            return false;
        if (other.getParametersToDelete() == null ^ this.getParametersToDelete() == null)
            return false;
        if (other.getParametersToDelete() != null && other.getParametersToDelete().equals(this.getParametersToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSettingsForUpdate() == null) ? 0 : getSettingsForUpdate().hashCode());
        hashCode = prime * hashCode + ((getRegionsOfInterestForUpdate() == null) ? 0 : getRegionsOfInterestForUpdate().hashCode());
        hashCode = prime * hashCode + ((getDataSharingPreferenceForUpdate() == null) ? 0 : getDataSharingPreferenceForUpdate().hashCode());
        hashCode = prime * hashCode + ((getParametersToDelete() == null) ? 0 : getParametersToDelete().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStreamProcessorRequest clone() {
        return (UpdateStreamProcessorRequest) super.clone();
    }

}
