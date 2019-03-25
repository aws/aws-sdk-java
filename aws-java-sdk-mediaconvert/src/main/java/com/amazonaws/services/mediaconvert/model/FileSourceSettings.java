/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for File-based Captions in Source
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/FileSourceSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSourceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of the 708
     * wrapper as well as translated into 708. 708 data present in the source content will be discarded.
     */
    private String convert608To708;
    /**
     * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl',
     * 'srt', and 'smi'.
     */
    private String sourceFile;
    /** Specifies a time delta in seconds to offset the captions from the source file. */
    private Integer timeDelta;

    /**
     * If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of the 708
     * wrapper as well as translated into 708. 708 data present in the source content will be discarded.
     * 
     * @param convert608To708
     *        If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of
     *        the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
     * @see FileSourceConvert608To708
     */

    public void setConvert608To708(String convert608To708) {
        this.convert608To708 = convert608To708;
    }

    /**
     * If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of the 708
     * wrapper as well as translated into 708. 708 data present in the source content will be discarded.
     * 
     * @return If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of
     *         the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
     * @see FileSourceConvert608To708
     */

    public String getConvert608To708() {
        return this.convert608To708;
    }

    /**
     * If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of the 708
     * wrapper as well as translated into 708. 708 data present in the source content will be discarded.
     * 
     * @param convert608To708
     *        If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of
     *        the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSourceConvert608To708
     */

    public FileSourceSettings withConvert608To708(String convert608To708) {
        setConvert608To708(convert608To708);
        return this;
    }

    /**
     * If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of the 708
     * wrapper as well as translated into 708. 708 data present in the source content will be discarded.
     * 
     * @param convert608To708
     *        If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of
     *        the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSourceConvert608To708
     */

    public FileSourceSettings withConvert608To708(FileSourceConvert608To708 convert608To708) {
        this.convert608To708 = convert608To708.toString();
        return this;
    }

    /**
     * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl',
     * 'srt', and 'smi'.
     * 
     * @param sourceFile
     *        External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp',
     *        'stl', 'srt', and 'smi'.
     */

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    /**
     * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl',
     * 'srt', and 'smi'.
     * 
     * @return External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp',
     *         'stl', 'srt', and 'smi'.
     */

    public String getSourceFile() {
        return this.sourceFile;
    }

    /**
     * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl',
     * 'srt', and 'smi'.
     * 
     * @param sourceFile
     *        External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp',
     *        'stl', 'srt', and 'smi'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSourceSettings withSourceFile(String sourceFile) {
        setSourceFile(sourceFile);
        return this;
    }

    /**
     * Specifies a time delta in seconds to offset the captions from the source file.
     * 
     * @param timeDelta
     *        Specifies a time delta in seconds to offset the captions from the source file.
     */

    public void setTimeDelta(Integer timeDelta) {
        this.timeDelta = timeDelta;
    }

    /**
     * Specifies a time delta in seconds to offset the captions from the source file.
     * 
     * @return Specifies a time delta in seconds to offset the captions from the source file.
     */

    public Integer getTimeDelta() {
        return this.timeDelta;
    }

    /**
     * Specifies a time delta in seconds to offset the captions from the source file.
     * 
     * @param timeDelta
     *        Specifies a time delta in seconds to offset the captions from the source file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSourceSettings withTimeDelta(Integer timeDelta) {
        setTimeDelta(timeDelta);
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
        if (getConvert608To708() != null)
            sb.append("Convert608To708: ").append(getConvert608To708()).append(",");
        if (getSourceFile() != null)
            sb.append("SourceFile: ").append(getSourceFile()).append(",");
        if (getTimeDelta() != null)
            sb.append("TimeDelta: ").append(getTimeDelta());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSourceSettings == false)
            return false;
        FileSourceSettings other = (FileSourceSettings) obj;
        if (other.getConvert608To708() == null ^ this.getConvert608To708() == null)
            return false;
        if (other.getConvert608To708() != null && other.getConvert608To708().equals(this.getConvert608To708()) == false)
            return false;
        if (other.getSourceFile() == null ^ this.getSourceFile() == null)
            return false;
        if (other.getSourceFile() != null && other.getSourceFile().equals(this.getSourceFile()) == false)
            return false;
        if (other.getTimeDelta() == null ^ this.getTimeDelta() == null)
            return false;
        if (other.getTimeDelta() != null && other.getTimeDelta().equals(this.getTimeDelta()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConvert608To708() == null) ? 0 : getConvert608To708().hashCode());
        hashCode = prime * hashCode + ((getSourceFile() == null) ? 0 : getSourceFile().hashCode());
        hashCode = prime * hashCode + ((getTimeDelta() == null) ? 0 : getTimeDelta().hashCode());
        return hashCode;
    }

    @Override
    public FileSourceSettings clone() {
        try {
            return (FileSourceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.FileSourceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
