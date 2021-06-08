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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Choose the audio codec for this output. Note that the option Dolby Digital passthrough (PASSTHROUGH) applies only to
 * Dolby Digital and Dolby Digital Plus audio inputs. Make sure that you choose a codec that's supported with your
 * output container:
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/reference-codecs-containers.html#reference-codecs
 * -containers-output-audio For audio-only outputs, make sure that both your input audio codec and your output audio
 * codec are supported for audio-only workflows. For more information, see:
 * https://docs.aws.amazon.com/mediaconvert/latest
 * /ug/reference-codecs-containers-input.html#reference-codecs-containers-input-audio-only and
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/reference-codecs-containers.html#audio-only-output
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AudioCodec {

    AAC("AAC"),
    MP2("MP2"),
    MP3("MP3"),
    WAV("WAV"),
    AIFF("AIFF"),
    AC3("AC3"),
    EAC3("EAC3"),
    EAC3_ATMOS("EAC3_ATMOS"),
    VORBIS("VORBIS"),
    OPUS("OPUS"),
    PASSTHROUGH("PASSTHROUGH");

    private String value;

    private AudioCodec(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return AudioCodec corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AudioCodec fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AudioCodec enumEntry : AudioCodec.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
