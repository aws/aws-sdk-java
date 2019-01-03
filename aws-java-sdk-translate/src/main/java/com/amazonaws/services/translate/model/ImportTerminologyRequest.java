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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ImportTerminology" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTerminologyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom terminology being imported.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy is
     * supported. In this case, the imported terminology will overwrite an existing terminology of the same name.
     * </p>
     */
    private String mergeStrategy;
    /**
     * <p>
     * The description of the custom terminology being imported.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The terminology data for the custom terminology being imported.
     * </p>
     */
    private TerminologyData terminologyData;
    /**
     * <p>
     * The encryption key for the custom terminology being imported.
     * </p>
     */
    private EncryptionKey encryptionKey;

    /**
     * <p>
     * The name of the custom terminology being imported.
     * </p>
     * 
     * @param name
     *        The name of the custom terminology being imported.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom terminology being imported.
     * </p>
     * 
     * @return The name of the custom terminology being imported.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom terminology being imported.
     * </p>
     * 
     * @param name
     *        The name of the custom terminology being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTerminologyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy is
     * supported. In this case, the imported terminology will overwrite an existing terminology of the same name.
     * </p>
     * 
     * @param mergeStrategy
     *        The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy
     *        is supported. In this case, the imported terminology will overwrite an existing terminology of the same
     *        name.
     * @see MergeStrategy
     */

    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy is
     * supported. In this case, the imported terminology will overwrite an existing terminology of the same name.
     * </p>
     * 
     * @return The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy
     *         is supported. In this case, the imported terminology will overwrite an existing terminology of the same
     *         name.
     * @see MergeStrategy
     */

    public String getMergeStrategy() {
        return this.mergeStrategy;
    }

    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy is
     * supported. In this case, the imported terminology will overwrite an existing terminology of the same name.
     * </p>
     * 
     * @param mergeStrategy
     *        The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy
     *        is supported. In this case, the imported terminology will overwrite an existing terminology of the same
     *        name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public ImportTerminologyRequest withMergeStrategy(String mergeStrategy) {
        setMergeStrategy(mergeStrategy);
        return this;
    }

    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy is
     * supported. In this case, the imported terminology will overwrite an existing terminology of the same name.
     * </p>
     * 
     * @param mergeStrategy
     *        The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy
     *        is supported. In this case, the imported terminology will overwrite an existing terminology of the same
     *        name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public ImportTerminologyRequest withMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The description of the custom terminology being imported.
     * </p>
     * 
     * @param description
     *        The description of the custom terminology being imported.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the custom terminology being imported.
     * </p>
     * 
     * @return The description of the custom terminology being imported.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the custom terminology being imported.
     * </p>
     * 
     * @param description
     *        The description of the custom terminology being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTerminologyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The terminology data for the custom terminology being imported.
     * </p>
     * 
     * @param terminologyData
     *        The terminology data for the custom terminology being imported.
     */

    public void setTerminologyData(TerminologyData terminologyData) {
        this.terminologyData = terminologyData;
    }

    /**
     * <p>
     * The terminology data for the custom terminology being imported.
     * </p>
     * 
     * @return The terminology data for the custom terminology being imported.
     */

    public TerminologyData getTerminologyData() {
        return this.terminologyData;
    }

    /**
     * <p>
     * The terminology data for the custom terminology being imported.
     * </p>
     * 
     * @param terminologyData
     *        The terminology data for the custom terminology being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTerminologyRequest withTerminologyData(TerminologyData terminologyData) {
        setTerminologyData(terminologyData);
        return this;
    }

    /**
     * <p>
     * The encryption key for the custom terminology being imported.
     * </p>
     * 
     * @param encryptionKey
     *        The encryption key for the custom terminology being imported.
     */

    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the custom terminology being imported.
     * </p>
     * 
     * @return The encryption key for the custom terminology being imported.
     */

    public EncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the custom terminology being imported.
     * </p>
     * 
     * @param encryptionKey
     *        The encryption key for the custom terminology being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTerminologyRequest withEncryptionKey(EncryptionKey encryptionKey) {
        setEncryptionKey(encryptionKey);
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
        if (getMergeStrategy() != null)
            sb.append("MergeStrategy: ").append(getMergeStrategy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTerminologyData() != null)
            sb.append("TerminologyData: ").append(getTerminologyData()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTerminologyRequest == false)
            return false;
        ImportTerminologyRequest other = (ImportTerminologyRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMergeStrategy() == null ^ this.getMergeStrategy() == null)
            return false;
        if (other.getMergeStrategy() != null && other.getMergeStrategy().equals(this.getMergeStrategy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTerminologyData() == null ^ this.getTerminologyData() == null)
            return false;
        if (other.getTerminologyData() != null && other.getTerminologyData().equals(this.getTerminologyData()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMergeStrategy() == null) ? 0 : getMergeStrategy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTerminologyData() == null) ? 0 : getTerminologyData().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        return hashCode;
    }

    @Override
    public ImportTerminologyRequest clone() {
        return (ImportTerminologyRequest) super.clone();
    }

}
