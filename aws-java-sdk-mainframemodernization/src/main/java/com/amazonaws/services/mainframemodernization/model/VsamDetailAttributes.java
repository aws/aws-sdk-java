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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The attributes of a VSAM type data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/VsamDetailAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VsamDetailAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The alternate key definitions, if any. A legacy dataset might not have any alternate key defined, but if those
     * alternate keys definitions exist, provide them as some applications will make use of them.
     * </p>
     */
    private java.util.List<AlternateKey> alternateKeys;
    /**
     * <p>
     * If set to True, enforces loading the data set into cache before it’s used by the application.
     * </p>
     */
    private Boolean cacheAtStartup;
    /**
     * <p>
     * Indicates whether indexes for this dataset are stored as compressed values. If you have a large data set
     * (typically &gt; 100 Mb), consider setting this flag to True.
     * </p>
     */
    private Boolean compressed;
    /**
     * <p>
     * The character set used by the data set. Can be ASCII, EBCDIC, or unknown.
     * </p>
     */
    private String encoding;
    /**
     * <p>
     * The primary key of the data set.
     * </p>
     */
    private PrimaryKey primaryKey;
    /**
     * <p>
     * The record format of the data set.
     * </p>
     */
    private String recordFormat;

    /**
     * <p>
     * The alternate key definitions, if any. A legacy dataset might not have any alternate key defined, but if those
     * alternate keys definitions exist, provide them as some applications will make use of them.
     * </p>
     * 
     * @return The alternate key definitions, if any. A legacy dataset might not have any alternate key defined, but if
     *         those alternate keys definitions exist, provide them as some applications will make use of them.
     */

    public java.util.List<AlternateKey> getAlternateKeys() {
        return alternateKeys;
    }

    /**
     * <p>
     * The alternate key definitions, if any. A legacy dataset might not have any alternate key defined, but if those
     * alternate keys definitions exist, provide them as some applications will make use of them.
     * </p>
     * 
     * @param alternateKeys
     *        The alternate key definitions, if any. A legacy dataset might not have any alternate key defined, but if
     *        those alternate keys definitions exist, provide them as some applications will make use of them.
     */

    public void setAlternateKeys(java.util.Collection<AlternateKey> alternateKeys) {
        if (alternateKeys == null) {
            this.alternateKeys = null;
            return;
        }

        this.alternateKeys = new java.util.ArrayList<AlternateKey>(alternateKeys);
    }

    /**
     * <p>
     * The alternate key definitions, if any. A legacy dataset might not have any alternate key defined, but if those
     * alternate keys definitions exist, provide them as some applications will make use of them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlternateKeys(java.util.Collection)} or {@link #withAlternateKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param alternateKeys
     *        The alternate key definitions, if any. A legacy dataset might not have any alternate key defined, but if
     *        those alternate keys definitions exist, provide them as some applications will make use of them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VsamDetailAttributes withAlternateKeys(AlternateKey... alternateKeys) {
        if (this.alternateKeys == null) {
            setAlternateKeys(new java.util.ArrayList<AlternateKey>(alternateKeys.length));
        }
        for (AlternateKey ele : alternateKeys) {
            this.alternateKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The alternate key definitions, if any. A legacy dataset might not have any alternate key defined, but if those
     * alternate keys definitions exist, provide them as some applications will make use of them.
     * </p>
     * 
     * @param alternateKeys
     *        The alternate key definitions, if any. A legacy dataset might not have any alternate key defined, but if
     *        those alternate keys definitions exist, provide them as some applications will make use of them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VsamDetailAttributes withAlternateKeys(java.util.Collection<AlternateKey> alternateKeys) {
        setAlternateKeys(alternateKeys);
        return this;
    }

    /**
     * <p>
     * If set to True, enforces loading the data set into cache before it’s used by the application.
     * </p>
     * 
     * @param cacheAtStartup
     *        If set to True, enforces loading the data set into cache before it’s used by the application.
     */

    public void setCacheAtStartup(Boolean cacheAtStartup) {
        this.cacheAtStartup = cacheAtStartup;
    }

    /**
     * <p>
     * If set to True, enforces loading the data set into cache before it’s used by the application.
     * </p>
     * 
     * @return If set to True, enforces loading the data set into cache before it’s used by the application.
     */

    public Boolean getCacheAtStartup() {
        return this.cacheAtStartup;
    }

    /**
     * <p>
     * If set to True, enforces loading the data set into cache before it’s used by the application.
     * </p>
     * 
     * @param cacheAtStartup
     *        If set to True, enforces loading the data set into cache before it’s used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VsamDetailAttributes withCacheAtStartup(Boolean cacheAtStartup) {
        setCacheAtStartup(cacheAtStartup);
        return this;
    }

    /**
     * <p>
     * If set to True, enforces loading the data set into cache before it’s used by the application.
     * </p>
     * 
     * @return If set to True, enforces loading the data set into cache before it’s used by the application.
     */

    public Boolean isCacheAtStartup() {
        return this.cacheAtStartup;
    }

    /**
     * <p>
     * Indicates whether indexes for this dataset are stored as compressed values. If you have a large data set
     * (typically &gt; 100 Mb), consider setting this flag to True.
     * </p>
     * 
     * @param compressed
     *        Indicates whether indexes for this dataset are stored as compressed values. If you have a large data set
     *        (typically &gt; 100 Mb), consider setting this flag to True.
     */

    public void setCompressed(Boolean compressed) {
        this.compressed = compressed;
    }

    /**
     * <p>
     * Indicates whether indexes for this dataset are stored as compressed values. If you have a large data set
     * (typically &gt; 100 Mb), consider setting this flag to True.
     * </p>
     * 
     * @return Indicates whether indexes for this dataset are stored as compressed values. If you have a large data set
     *         (typically &gt; 100 Mb), consider setting this flag to True.
     */

    public Boolean getCompressed() {
        return this.compressed;
    }

    /**
     * <p>
     * Indicates whether indexes for this dataset are stored as compressed values. If you have a large data set
     * (typically &gt; 100 Mb), consider setting this flag to True.
     * </p>
     * 
     * @param compressed
     *        Indicates whether indexes for this dataset are stored as compressed values. If you have a large data set
     *        (typically &gt; 100 Mb), consider setting this flag to True.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VsamDetailAttributes withCompressed(Boolean compressed) {
        setCompressed(compressed);
        return this;
    }

    /**
     * <p>
     * Indicates whether indexes for this dataset are stored as compressed values. If you have a large data set
     * (typically &gt; 100 Mb), consider setting this flag to True.
     * </p>
     * 
     * @return Indicates whether indexes for this dataset are stored as compressed values. If you have a large data set
     *         (typically &gt; 100 Mb), consider setting this flag to True.
     */

    public Boolean isCompressed() {
        return this.compressed;
    }

    /**
     * <p>
     * The character set used by the data set. Can be ASCII, EBCDIC, or unknown.
     * </p>
     * 
     * @param encoding
     *        The character set used by the data set. Can be ASCII, EBCDIC, or unknown.
     */

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * <p>
     * The character set used by the data set. Can be ASCII, EBCDIC, or unknown.
     * </p>
     * 
     * @return The character set used by the data set. Can be ASCII, EBCDIC, or unknown.
     */

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * <p>
     * The character set used by the data set. Can be ASCII, EBCDIC, or unknown.
     * </p>
     * 
     * @param encoding
     *        The character set used by the data set. Can be ASCII, EBCDIC, or unknown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VsamDetailAttributes withEncoding(String encoding) {
        setEncoding(encoding);
        return this;
    }

    /**
     * <p>
     * The primary key of the data set.
     * </p>
     * 
     * @param primaryKey
     *        The primary key of the data set.
     */

    public void setPrimaryKey(PrimaryKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * <p>
     * The primary key of the data set.
     * </p>
     * 
     * @return The primary key of the data set.
     */

    public PrimaryKey getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * <p>
     * The primary key of the data set.
     * </p>
     * 
     * @param primaryKey
     *        The primary key of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VsamDetailAttributes withPrimaryKey(PrimaryKey primaryKey) {
        setPrimaryKey(primaryKey);
        return this;
    }

    /**
     * <p>
     * The record format of the data set.
     * </p>
     * 
     * @param recordFormat
     *        The record format of the data set.
     */

    public void setRecordFormat(String recordFormat) {
        this.recordFormat = recordFormat;
    }

    /**
     * <p>
     * The record format of the data set.
     * </p>
     * 
     * @return The record format of the data set.
     */

    public String getRecordFormat() {
        return this.recordFormat;
    }

    /**
     * <p>
     * The record format of the data set.
     * </p>
     * 
     * @param recordFormat
     *        The record format of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VsamDetailAttributes withRecordFormat(String recordFormat) {
        setRecordFormat(recordFormat);
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
        if (getAlternateKeys() != null)
            sb.append("AlternateKeys: ").append(getAlternateKeys()).append(",");
        if (getCacheAtStartup() != null)
            sb.append("CacheAtStartup: ").append(getCacheAtStartup()).append(",");
        if (getCompressed() != null)
            sb.append("Compressed: ").append(getCompressed()).append(",");
        if (getEncoding() != null)
            sb.append("Encoding: ").append(getEncoding()).append(",");
        if (getPrimaryKey() != null)
            sb.append("PrimaryKey: ").append(getPrimaryKey()).append(",");
        if (getRecordFormat() != null)
            sb.append("RecordFormat: ").append(getRecordFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VsamDetailAttributes == false)
            return false;
        VsamDetailAttributes other = (VsamDetailAttributes) obj;
        if (other.getAlternateKeys() == null ^ this.getAlternateKeys() == null)
            return false;
        if (other.getAlternateKeys() != null && other.getAlternateKeys().equals(this.getAlternateKeys()) == false)
            return false;
        if (other.getCacheAtStartup() == null ^ this.getCacheAtStartup() == null)
            return false;
        if (other.getCacheAtStartup() != null && other.getCacheAtStartup().equals(this.getCacheAtStartup()) == false)
            return false;
        if (other.getCompressed() == null ^ this.getCompressed() == null)
            return false;
        if (other.getCompressed() != null && other.getCompressed().equals(this.getCompressed()) == false)
            return false;
        if (other.getEncoding() == null ^ this.getEncoding() == null)
            return false;
        if (other.getEncoding() != null && other.getEncoding().equals(this.getEncoding()) == false)
            return false;
        if (other.getPrimaryKey() == null ^ this.getPrimaryKey() == null)
            return false;
        if (other.getPrimaryKey() != null && other.getPrimaryKey().equals(this.getPrimaryKey()) == false)
            return false;
        if (other.getRecordFormat() == null ^ this.getRecordFormat() == null)
            return false;
        if (other.getRecordFormat() != null && other.getRecordFormat().equals(this.getRecordFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlternateKeys() == null) ? 0 : getAlternateKeys().hashCode());
        hashCode = prime * hashCode + ((getCacheAtStartup() == null) ? 0 : getCacheAtStartup().hashCode());
        hashCode = prime * hashCode + ((getCompressed() == null) ? 0 : getCompressed().hashCode());
        hashCode = prime * hashCode + ((getEncoding() == null) ? 0 : getEncoding().hashCode());
        hashCode = prime * hashCode + ((getPrimaryKey() == null) ? 0 : getPrimaryKey().hashCode());
        hashCode = prime * hashCode + ((getRecordFormat() == null) ? 0 : getRecordFormat().hashCode());
        return hashCode;
    }

    @Override
    public VsamDetailAttributes clone() {
        try {
            return (VsamDetailAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.VsamDetailAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
