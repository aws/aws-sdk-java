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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Audio Dolby EDecode
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioDolbyEDecode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioDolbyEDecode implements Serializable, Cloneable, StructuredPojo {

    /**
     * Applies only to Dolby E. Enter the program ID (according to the metadata in the audio) of the Dolby E program to
     * extract from the specified track. One program extracted per audio selector. To select multiple programs, create
     * multiple selectors with the same Track and different Program numbers. “All channels” means to ignore the program
     * IDs and include all the channels in this selector; useful if metadata is known to be incorrect.
     */
    private String programSelection;

    /**
     * Applies only to Dolby E. Enter the program ID (according to the metadata in the audio) of the Dolby E program to
     * extract from the specified track. One program extracted per audio selector. To select multiple programs, create
     * multiple selectors with the same Track and different Program numbers. “All channels” means to ignore the program
     * IDs and include all the channels in this selector; useful if metadata is known to be incorrect.
     * 
     * @param programSelection
     *        Applies only to Dolby E. Enter the program ID (according to the metadata in the audio) of the Dolby E
     *        program to extract from the specified track. One program extracted per audio selector. To select multiple
     *        programs, create multiple selectors with the same Track and different Program numbers. “All channels”
     *        means to ignore the program IDs and include all the channels in this selector; useful if metadata is known
     *        to be incorrect.
     * @see DolbyEProgramSelection
     */

    public void setProgramSelection(String programSelection) {
        this.programSelection = programSelection;
    }

    /**
     * Applies only to Dolby E. Enter the program ID (according to the metadata in the audio) of the Dolby E program to
     * extract from the specified track. One program extracted per audio selector. To select multiple programs, create
     * multiple selectors with the same Track and different Program numbers. “All channels” means to ignore the program
     * IDs and include all the channels in this selector; useful if metadata is known to be incorrect.
     * 
     * @return Applies only to Dolby E. Enter the program ID (according to the metadata in the audio) of the Dolby E
     *         program to extract from the specified track. One program extracted per audio selector. To select multiple
     *         programs, create multiple selectors with the same Track and different Program numbers. “All channels”
     *         means to ignore the program IDs and include all the channels in this selector; useful if metadata is
     *         known to be incorrect.
     * @see DolbyEProgramSelection
     */

    public String getProgramSelection() {
        return this.programSelection;
    }

    /**
     * Applies only to Dolby E. Enter the program ID (according to the metadata in the audio) of the Dolby E program to
     * extract from the specified track. One program extracted per audio selector. To select multiple programs, create
     * multiple selectors with the same Track and different Program numbers. “All channels” means to ignore the program
     * IDs and include all the channels in this selector; useful if metadata is known to be incorrect.
     * 
     * @param programSelection
     *        Applies only to Dolby E. Enter the program ID (according to the metadata in the audio) of the Dolby E
     *        program to extract from the specified track. One program extracted per audio selector. To select multiple
     *        programs, create multiple selectors with the same Track and different Program numbers. “All channels”
     *        means to ignore the program IDs and include all the channels in this selector; useful if metadata is known
     *        to be incorrect.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DolbyEProgramSelection
     */

    public AudioDolbyEDecode withProgramSelection(String programSelection) {
        setProgramSelection(programSelection);
        return this;
    }

    /**
     * Applies only to Dolby E. Enter the program ID (according to the metadata in the audio) of the Dolby E program to
     * extract from the specified track. One program extracted per audio selector. To select multiple programs, create
     * multiple selectors with the same Track and different Program numbers. “All channels” means to ignore the program
     * IDs and include all the channels in this selector; useful if metadata is known to be incorrect.
     * 
     * @param programSelection
     *        Applies only to Dolby E. Enter the program ID (according to the metadata in the audio) of the Dolby E
     *        program to extract from the specified track. One program extracted per audio selector. To select multiple
     *        programs, create multiple selectors with the same Track and different Program numbers. “All channels”
     *        means to ignore the program IDs and include all the channels in this selector; useful if metadata is known
     *        to be incorrect.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DolbyEProgramSelection
     */

    public AudioDolbyEDecode withProgramSelection(DolbyEProgramSelection programSelection) {
        this.programSelection = programSelection.toString();
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
        if (getProgramSelection() != null)
            sb.append("ProgramSelection: ").append(getProgramSelection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioDolbyEDecode == false)
            return false;
        AudioDolbyEDecode other = (AudioDolbyEDecode) obj;
        if (other.getProgramSelection() == null ^ this.getProgramSelection() == null)
            return false;
        if (other.getProgramSelection() != null && other.getProgramSelection().equals(this.getProgramSelection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgramSelection() == null) ? 0 : getProgramSelection().hashCode());
        return hashCode;
    }

    @Override
    public AudioDolbyEDecode clone() {
        try {
            return (AudioDolbyEDecode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioDolbyEDecodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
