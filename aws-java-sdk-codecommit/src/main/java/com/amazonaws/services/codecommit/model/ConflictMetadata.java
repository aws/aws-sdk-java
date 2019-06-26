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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the metadata for a conflict in a merge operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ConflictMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path of the file that contains conflicts.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The file sizes of the file in the source, destination, and base of the merge.
     * </p>
     */
    private FileSizes fileSizes;
    /**
     * <p>
     * The file modes of the file in the source, destination, and base of the merge.
     * </p>
     */
    private FileModes fileModes;
    /**
     * <p>
     * Information about any object type conflicts in a merge operation.
     * </p>
     */
    private ObjectTypes objectTypes;
    /**
     * <p>
     * The number of conflicts, including both hunk conflicts and metadata conflicts.
     * </p>
     */
    private Integer numberOfConflicts;
    /**
     * <p>
     * A boolean value (true or false) indicating whether the file is binary or textual in the source, destination, and
     * base of the merge.
     * </p>
     */
    private IsBinaryFile isBinaryFile;
    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the content of a file.
     * </p>
     */
    private Boolean contentConflict;
    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the file mode of a file.
     * </p>
     */
    private Boolean fileModeConflict;
    /**
     * <p>
     * A boolean value (true or false) indicating whether there are conflicts between the branches in the object type of
     * a file, folder, or submodule.
     * </p>
     */
    private Boolean objectTypeConflict;
    /**
     * <p>
     * Whether an add, modify, or delete operation caused the conflict between the source and destination of the merge.
     * </p>
     */
    private MergeOperations mergeOperations;

    /**
     * <p>
     * The path of the file that contains conflicts.
     * </p>
     * 
     * @param filePath
     *        The path of the file that contains conflicts.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The path of the file that contains conflicts.
     * </p>
     * 
     * @return The path of the file that contains conflicts.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The path of the file that contains conflicts.
     * </p>
     * 
     * @param filePath
     *        The path of the file that contains conflicts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictMetadata withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The file sizes of the file in the source, destination, and base of the merge.
     * </p>
     * 
     * @param fileSizes
     *        The file sizes of the file in the source, destination, and base of the merge.
     */

    public void setFileSizes(FileSizes fileSizes) {
        this.fileSizes = fileSizes;
    }

    /**
     * <p>
     * The file sizes of the file in the source, destination, and base of the merge.
     * </p>
     * 
     * @return The file sizes of the file in the source, destination, and base of the merge.
     */

    public FileSizes getFileSizes() {
        return this.fileSizes;
    }

    /**
     * <p>
     * The file sizes of the file in the source, destination, and base of the merge.
     * </p>
     * 
     * @param fileSizes
     *        The file sizes of the file in the source, destination, and base of the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictMetadata withFileSizes(FileSizes fileSizes) {
        setFileSizes(fileSizes);
        return this;
    }

    /**
     * <p>
     * The file modes of the file in the source, destination, and base of the merge.
     * </p>
     * 
     * @param fileModes
     *        The file modes of the file in the source, destination, and base of the merge.
     */

    public void setFileModes(FileModes fileModes) {
        this.fileModes = fileModes;
    }

    /**
     * <p>
     * The file modes of the file in the source, destination, and base of the merge.
     * </p>
     * 
     * @return The file modes of the file in the source, destination, and base of the merge.
     */

    public FileModes getFileModes() {
        return this.fileModes;
    }

    /**
     * <p>
     * The file modes of the file in the source, destination, and base of the merge.
     * </p>
     * 
     * @param fileModes
     *        The file modes of the file in the source, destination, and base of the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictMetadata withFileModes(FileModes fileModes) {
        setFileModes(fileModes);
        return this;
    }

    /**
     * <p>
     * Information about any object type conflicts in a merge operation.
     * </p>
     * 
     * @param objectTypes
     *        Information about any object type conflicts in a merge operation.
     */

    public void setObjectTypes(ObjectTypes objectTypes) {
        this.objectTypes = objectTypes;
    }

    /**
     * <p>
     * Information about any object type conflicts in a merge operation.
     * </p>
     * 
     * @return Information about any object type conflicts in a merge operation.
     */

    public ObjectTypes getObjectTypes() {
        return this.objectTypes;
    }

    /**
     * <p>
     * Information about any object type conflicts in a merge operation.
     * </p>
     * 
     * @param objectTypes
     *        Information about any object type conflicts in a merge operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictMetadata withObjectTypes(ObjectTypes objectTypes) {
        setObjectTypes(objectTypes);
        return this;
    }

    /**
     * <p>
     * The number of conflicts, including both hunk conflicts and metadata conflicts.
     * </p>
     * 
     * @param numberOfConflicts
     *        The number of conflicts, including both hunk conflicts and metadata conflicts.
     */

    public void setNumberOfConflicts(Integer numberOfConflicts) {
        this.numberOfConflicts = numberOfConflicts;
    }

    /**
     * <p>
     * The number of conflicts, including both hunk conflicts and metadata conflicts.
     * </p>
     * 
     * @return The number of conflicts, including both hunk conflicts and metadata conflicts.
     */

    public Integer getNumberOfConflicts() {
        return this.numberOfConflicts;
    }

    /**
     * <p>
     * The number of conflicts, including both hunk conflicts and metadata conflicts.
     * </p>
     * 
     * @param numberOfConflicts
     *        The number of conflicts, including both hunk conflicts and metadata conflicts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictMetadata withNumberOfConflicts(Integer numberOfConflicts) {
        setNumberOfConflicts(numberOfConflicts);
        return this;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether the file is binary or textual in the source, destination, and
     * base of the merge.
     * </p>
     * 
     * @param isBinaryFile
     *        A boolean value (true or false) indicating whether the file is binary or textual in the source,
     *        destination, and base of the merge.
     */

    public void setIsBinaryFile(IsBinaryFile isBinaryFile) {
        this.isBinaryFile = isBinaryFile;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether the file is binary or textual in the source, destination, and
     * base of the merge.
     * </p>
     * 
     * @return A boolean value (true or false) indicating whether the file is binary or textual in the source,
     *         destination, and base of the merge.
     */

    public IsBinaryFile getIsBinaryFile() {
        return this.isBinaryFile;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether the file is binary or textual in the source, destination, and
     * base of the merge.
     * </p>
     * 
     * @param isBinaryFile
     *        A boolean value (true or false) indicating whether the file is binary or textual in the source,
     *        destination, and base of the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictMetadata withIsBinaryFile(IsBinaryFile isBinaryFile) {
        setIsBinaryFile(isBinaryFile);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the content of a file.
     * </p>
     * 
     * @param contentConflict
     *        A boolean value indicating whether there are conflicts in the content of a file.
     */

    public void setContentConflict(Boolean contentConflict) {
        this.contentConflict = contentConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the content of a file.
     * </p>
     * 
     * @return A boolean value indicating whether there are conflicts in the content of a file.
     */

    public Boolean getContentConflict() {
        return this.contentConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the content of a file.
     * </p>
     * 
     * @param contentConflict
     *        A boolean value indicating whether there are conflicts in the content of a file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictMetadata withContentConflict(Boolean contentConflict) {
        setContentConflict(contentConflict);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the content of a file.
     * </p>
     * 
     * @return A boolean value indicating whether there are conflicts in the content of a file.
     */

    public Boolean isContentConflict() {
        return this.contentConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the file mode of a file.
     * </p>
     * 
     * @param fileModeConflict
     *        A boolean value indicating whether there are conflicts in the file mode of a file.
     */

    public void setFileModeConflict(Boolean fileModeConflict) {
        this.fileModeConflict = fileModeConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the file mode of a file.
     * </p>
     * 
     * @return A boolean value indicating whether there are conflicts in the file mode of a file.
     */

    public Boolean getFileModeConflict() {
        return this.fileModeConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the file mode of a file.
     * </p>
     * 
     * @param fileModeConflict
     *        A boolean value indicating whether there are conflicts in the file mode of a file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictMetadata withFileModeConflict(Boolean fileModeConflict) {
        setFileModeConflict(fileModeConflict);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the file mode of a file.
     * </p>
     * 
     * @return A boolean value indicating whether there are conflicts in the file mode of a file.
     */

    public Boolean isFileModeConflict() {
        return this.fileModeConflict;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether there are conflicts between the branches in the object type of
     * a file, folder, or submodule.
     * </p>
     * 
     * @param objectTypeConflict
     *        A boolean value (true or false) indicating whether there are conflicts between the branches in the object
     *        type of a file, folder, or submodule.
     */

    public void setObjectTypeConflict(Boolean objectTypeConflict) {
        this.objectTypeConflict = objectTypeConflict;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether there are conflicts between the branches in the object type of
     * a file, folder, or submodule.
     * </p>
     * 
     * @return A boolean value (true or false) indicating whether there are conflicts between the branches in the object
     *         type of a file, folder, or submodule.
     */

    public Boolean getObjectTypeConflict() {
        return this.objectTypeConflict;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether there are conflicts between the branches in the object type of
     * a file, folder, or submodule.
     * </p>
     * 
     * @param objectTypeConflict
     *        A boolean value (true or false) indicating whether there are conflicts between the branches in the object
     *        type of a file, folder, or submodule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictMetadata withObjectTypeConflict(Boolean objectTypeConflict) {
        setObjectTypeConflict(objectTypeConflict);
        return this;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether there are conflicts between the branches in the object type of
     * a file, folder, or submodule.
     * </p>
     * 
     * @return A boolean value (true or false) indicating whether there are conflicts between the branches in the object
     *         type of a file, folder, or submodule.
     */

    public Boolean isObjectTypeConflict() {
        return this.objectTypeConflict;
    }

    /**
     * <p>
     * Whether an add, modify, or delete operation caused the conflict between the source and destination of the merge.
     * </p>
     * 
     * @param mergeOperations
     *        Whether an add, modify, or delete operation caused the conflict between the source and destination of the
     *        merge.
     */

    public void setMergeOperations(MergeOperations mergeOperations) {
        this.mergeOperations = mergeOperations;
    }

    /**
     * <p>
     * Whether an add, modify, or delete operation caused the conflict between the source and destination of the merge.
     * </p>
     * 
     * @return Whether an add, modify, or delete operation caused the conflict between the source and destination of the
     *         merge.
     */

    public MergeOperations getMergeOperations() {
        return this.mergeOperations;
    }

    /**
     * <p>
     * Whether an add, modify, or delete operation caused the conflict between the source and destination of the merge.
     * </p>
     * 
     * @param mergeOperations
     *        Whether an add, modify, or delete operation caused the conflict between the source and destination of the
     *        merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictMetadata withMergeOperations(MergeOperations mergeOperations) {
        setMergeOperations(mergeOperations);
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
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getFileSizes() != null)
            sb.append("FileSizes: ").append(getFileSizes()).append(",");
        if (getFileModes() != null)
            sb.append("FileModes: ").append(getFileModes()).append(",");
        if (getObjectTypes() != null)
            sb.append("ObjectTypes: ").append(getObjectTypes()).append(",");
        if (getNumberOfConflicts() != null)
            sb.append("NumberOfConflicts: ").append(getNumberOfConflicts()).append(",");
        if (getIsBinaryFile() != null)
            sb.append("IsBinaryFile: ").append(getIsBinaryFile()).append(",");
        if (getContentConflict() != null)
            sb.append("ContentConflict: ").append(getContentConflict()).append(",");
        if (getFileModeConflict() != null)
            sb.append("FileModeConflict: ").append(getFileModeConflict()).append(",");
        if (getObjectTypeConflict() != null)
            sb.append("ObjectTypeConflict: ").append(getObjectTypeConflict()).append(",");
        if (getMergeOperations() != null)
            sb.append("MergeOperations: ").append(getMergeOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConflictMetadata == false)
            return false;
        ConflictMetadata other = (ConflictMetadata) obj;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileSizes() == null ^ this.getFileSizes() == null)
            return false;
        if (other.getFileSizes() != null && other.getFileSizes().equals(this.getFileSizes()) == false)
            return false;
        if (other.getFileModes() == null ^ this.getFileModes() == null)
            return false;
        if (other.getFileModes() != null && other.getFileModes().equals(this.getFileModes()) == false)
            return false;
        if (other.getObjectTypes() == null ^ this.getObjectTypes() == null)
            return false;
        if (other.getObjectTypes() != null && other.getObjectTypes().equals(this.getObjectTypes()) == false)
            return false;
        if (other.getNumberOfConflicts() == null ^ this.getNumberOfConflicts() == null)
            return false;
        if (other.getNumberOfConflicts() != null && other.getNumberOfConflicts().equals(this.getNumberOfConflicts()) == false)
            return false;
        if (other.getIsBinaryFile() == null ^ this.getIsBinaryFile() == null)
            return false;
        if (other.getIsBinaryFile() != null && other.getIsBinaryFile().equals(this.getIsBinaryFile()) == false)
            return false;
        if (other.getContentConflict() == null ^ this.getContentConflict() == null)
            return false;
        if (other.getContentConflict() != null && other.getContentConflict().equals(this.getContentConflict()) == false)
            return false;
        if (other.getFileModeConflict() == null ^ this.getFileModeConflict() == null)
            return false;
        if (other.getFileModeConflict() != null && other.getFileModeConflict().equals(this.getFileModeConflict()) == false)
            return false;
        if (other.getObjectTypeConflict() == null ^ this.getObjectTypeConflict() == null)
            return false;
        if (other.getObjectTypeConflict() != null && other.getObjectTypeConflict().equals(this.getObjectTypeConflict()) == false)
            return false;
        if (other.getMergeOperations() == null ^ this.getMergeOperations() == null)
            return false;
        if (other.getMergeOperations() != null && other.getMergeOperations().equals(this.getMergeOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFileSizes() == null) ? 0 : getFileSizes().hashCode());
        hashCode = prime * hashCode + ((getFileModes() == null) ? 0 : getFileModes().hashCode());
        hashCode = prime * hashCode + ((getObjectTypes() == null) ? 0 : getObjectTypes().hashCode());
        hashCode = prime * hashCode + ((getNumberOfConflicts() == null) ? 0 : getNumberOfConflicts().hashCode());
        hashCode = prime * hashCode + ((getIsBinaryFile() == null) ? 0 : getIsBinaryFile().hashCode());
        hashCode = prime * hashCode + ((getContentConflict() == null) ? 0 : getContentConflict().hashCode());
        hashCode = prime * hashCode + ((getFileModeConflict() == null) ? 0 : getFileModeConflict().hashCode());
        hashCode = prime * hashCode + ((getObjectTypeConflict() == null) ? 0 : getObjectTypeConflict().hashCode());
        hashCode = prime * hashCode + ((getMergeOperations() == null) ? 0 : getMergeOperations().hashCode());
        return hashCode;
    }

    @Override
    public ConflictMetadata clone() {
        try {
            return (ConflictMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ConflictMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
