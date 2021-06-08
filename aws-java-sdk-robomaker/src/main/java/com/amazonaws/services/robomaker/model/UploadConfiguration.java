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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides upload configuration information. Files are uploaded from the simulation job to a location you specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UploadConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A prefix that specifies where files will be uploaded in Amazon S3. It is appended to the simulation output
     * location to determine the final path.
     * </p>
     * <p>
     * For example, if your simulation output location is <code>s3://my-bucket</code> and your upload configuration name
     * is <code>robot-test</code>, your files will be uploaded to
     * <code>s3://my-bucket/&lt;simid&gt;/&lt;runid&gt;/robot-test</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the path of the file(s) to upload. Standard Unix glob matching rules are accepted, with the addition of
     * <code>**</code> as a <i>super asterisk</i>. For example, specifying <code>/var/log/**.log</code> causes all .log
     * files in the <code>/var/log</code> directory tree to be collected. For more examples, see <a
     * href="https://github.com/gobwas/glob">Glob Library</a>.
     * </p>
     */
    private String path;
    /**
     * <p>
     * Specifies when to upload the files:
     * </p>
     * <dl>
     * <dt>UPLOAD_ON_TERMINATE</dt>
     * <dd>
     * <p>
     * Matching files are uploaded once the simulation enters the <code>TERMINATING</code> state. Matching files are not
     * uploaded until all of your code (including tools) have stopped.
     * </p>
     * <p>
     * If there is a problem uploading a file, the upload is retried. If problems persist, no further upload attempts
     * will be made.
     * </p>
     * </dd>
     * <dt>UPLOAD_ROLLING_AUTO_REMOVE</dt>
     * <dd>
     * <p>
     * Matching files are uploaded as they are created. They are deleted after they are uploaded. The specified path is
     * checked every 5 seconds. A final check is made when all of your code (including tools) have stopped.
     * </p>
     * </dd>
     * </dl>
     */
    private String uploadBehavior;

    /**
     * <p>
     * A prefix that specifies where files will be uploaded in Amazon S3. It is appended to the simulation output
     * location to determine the final path.
     * </p>
     * <p>
     * For example, if your simulation output location is <code>s3://my-bucket</code> and your upload configuration name
     * is <code>robot-test</code>, your files will be uploaded to
     * <code>s3://my-bucket/&lt;simid&gt;/&lt;runid&gt;/robot-test</code>.
     * </p>
     * 
     * @param name
     *        A prefix that specifies where files will be uploaded in Amazon S3. It is appended to the simulation output
     *        location to determine the final path. </p>
     *        <p>
     *        For example, if your simulation output location is <code>s3://my-bucket</code> and your upload
     *        configuration name is <code>robot-test</code>, your files will be uploaded to
     *        <code>s3://my-bucket/&lt;simid&gt;/&lt;runid&gt;/robot-test</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A prefix that specifies where files will be uploaded in Amazon S3. It is appended to the simulation output
     * location to determine the final path.
     * </p>
     * <p>
     * For example, if your simulation output location is <code>s3://my-bucket</code> and your upload configuration name
     * is <code>robot-test</code>, your files will be uploaded to
     * <code>s3://my-bucket/&lt;simid&gt;/&lt;runid&gt;/robot-test</code>.
     * </p>
     * 
     * @return A prefix that specifies where files will be uploaded in Amazon S3. It is appended to the simulation
     *         output location to determine the final path. </p>
     *         <p>
     *         For example, if your simulation output location is <code>s3://my-bucket</code> and your upload
     *         configuration name is <code>robot-test</code>, your files will be uploaded to
     *         <code>s3://my-bucket/&lt;simid&gt;/&lt;runid&gt;/robot-test</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A prefix that specifies where files will be uploaded in Amazon S3. It is appended to the simulation output
     * location to determine the final path.
     * </p>
     * <p>
     * For example, if your simulation output location is <code>s3://my-bucket</code> and your upload configuration name
     * is <code>robot-test</code>, your files will be uploaded to
     * <code>s3://my-bucket/&lt;simid&gt;/&lt;runid&gt;/robot-test</code>.
     * </p>
     * 
     * @param name
     *        A prefix that specifies where files will be uploaded in Amazon S3. It is appended to the simulation output
     *        location to determine the final path. </p>
     *        <p>
     *        For example, if your simulation output location is <code>s3://my-bucket</code> and your upload
     *        configuration name is <code>robot-test</code>, your files will be uploaded to
     *        <code>s3://my-bucket/&lt;simid&gt;/&lt;runid&gt;/robot-test</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the path of the file(s) to upload. Standard Unix glob matching rules are accepted, with the addition of
     * <code>**</code> as a <i>super asterisk</i>. For example, specifying <code>/var/log/**.log</code> causes all .log
     * files in the <code>/var/log</code> directory tree to be collected. For more examples, see <a
     * href="https://github.com/gobwas/glob">Glob Library</a>.
     * </p>
     * 
     * @param path
     *        Specifies the path of the file(s) to upload. Standard Unix glob matching rules are accepted, with the
     *        addition of <code>**</code> as a <i>super asterisk</i>. For example, specifying
     *        <code>/var/log/**.log</code> causes all .log files in the <code>/var/log</code> directory tree to be
     *        collected. For more examples, see <a href="https://github.com/gobwas/glob">Glob Library</a>.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Specifies the path of the file(s) to upload. Standard Unix glob matching rules are accepted, with the addition of
     * <code>**</code> as a <i>super asterisk</i>. For example, specifying <code>/var/log/**.log</code> causes all .log
     * files in the <code>/var/log</code> directory tree to be collected. For more examples, see <a
     * href="https://github.com/gobwas/glob">Glob Library</a>.
     * </p>
     * 
     * @return Specifies the path of the file(s) to upload. Standard Unix glob matching rules are accepted, with the
     *         addition of <code>**</code> as a <i>super asterisk</i>. For example, specifying
     *         <code>/var/log/**.log</code> causes all .log files in the <code>/var/log</code> directory tree to be
     *         collected. For more examples, see <a href="https://github.com/gobwas/glob">Glob Library</a>.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * Specifies the path of the file(s) to upload. Standard Unix glob matching rules are accepted, with the addition of
     * <code>**</code> as a <i>super asterisk</i>. For example, specifying <code>/var/log/**.log</code> causes all .log
     * files in the <code>/var/log</code> directory tree to be collected. For more examples, see <a
     * href="https://github.com/gobwas/glob">Glob Library</a>.
     * </p>
     * 
     * @param path
     *        Specifies the path of the file(s) to upload. Standard Unix glob matching rules are accepted, with the
     *        addition of <code>**</code> as a <i>super asterisk</i>. For example, specifying
     *        <code>/var/log/**.log</code> causes all .log files in the <code>/var/log</code> directory tree to be
     *        collected. For more examples, see <a href="https://github.com/gobwas/glob">Glob Library</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadConfiguration withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Specifies when to upload the files:
     * </p>
     * <dl>
     * <dt>UPLOAD_ON_TERMINATE</dt>
     * <dd>
     * <p>
     * Matching files are uploaded once the simulation enters the <code>TERMINATING</code> state. Matching files are not
     * uploaded until all of your code (including tools) have stopped.
     * </p>
     * <p>
     * If there is a problem uploading a file, the upload is retried. If problems persist, no further upload attempts
     * will be made.
     * </p>
     * </dd>
     * <dt>UPLOAD_ROLLING_AUTO_REMOVE</dt>
     * <dd>
     * <p>
     * Matching files are uploaded as they are created. They are deleted after they are uploaded. The specified path is
     * checked every 5 seconds. A final check is made when all of your code (including tools) have stopped.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param uploadBehavior
     *        Specifies when to upload the files:</p>
     *        <dl>
     *        <dt>UPLOAD_ON_TERMINATE</dt>
     *        <dd>
     *        <p>
     *        Matching files are uploaded once the simulation enters the <code>TERMINATING</code> state. Matching files
     *        are not uploaded until all of your code (including tools) have stopped.
     *        </p>
     *        <p>
     *        If there is a problem uploading a file, the upload is retried. If problems persist, no further upload
     *        attempts will be made.
     *        </p>
     *        </dd>
     *        <dt>UPLOAD_ROLLING_AUTO_REMOVE</dt>
     *        <dd>
     *        <p>
     *        Matching files are uploaded as they are created. They are deleted after they are uploaded. The specified
     *        path is checked every 5 seconds. A final check is made when all of your code (including tools) have
     *        stopped.
     *        </p>
     *        </dd>
     * @see UploadBehavior
     */

    public void setUploadBehavior(String uploadBehavior) {
        this.uploadBehavior = uploadBehavior;
    }

    /**
     * <p>
     * Specifies when to upload the files:
     * </p>
     * <dl>
     * <dt>UPLOAD_ON_TERMINATE</dt>
     * <dd>
     * <p>
     * Matching files are uploaded once the simulation enters the <code>TERMINATING</code> state. Matching files are not
     * uploaded until all of your code (including tools) have stopped.
     * </p>
     * <p>
     * If there is a problem uploading a file, the upload is retried. If problems persist, no further upload attempts
     * will be made.
     * </p>
     * </dd>
     * <dt>UPLOAD_ROLLING_AUTO_REMOVE</dt>
     * <dd>
     * <p>
     * Matching files are uploaded as they are created. They are deleted after they are uploaded. The specified path is
     * checked every 5 seconds. A final check is made when all of your code (including tools) have stopped.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies when to upload the files:</p>
     *         <dl>
     *         <dt>UPLOAD_ON_TERMINATE</dt>
     *         <dd>
     *         <p>
     *         Matching files are uploaded once the simulation enters the <code>TERMINATING</code> state. Matching files
     *         are not uploaded until all of your code (including tools) have stopped.
     *         </p>
     *         <p>
     *         If there is a problem uploading a file, the upload is retried. If problems persist, no further upload
     *         attempts will be made.
     *         </p>
     *         </dd>
     *         <dt>UPLOAD_ROLLING_AUTO_REMOVE</dt>
     *         <dd>
     *         <p>
     *         Matching files are uploaded as they are created. They are deleted after they are uploaded. The specified
     *         path is checked every 5 seconds. A final check is made when all of your code (including tools) have
     *         stopped.
     *         </p>
     *         </dd>
     * @see UploadBehavior
     */

    public String getUploadBehavior() {
        return this.uploadBehavior;
    }

    /**
     * <p>
     * Specifies when to upload the files:
     * </p>
     * <dl>
     * <dt>UPLOAD_ON_TERMINATE</dt>
     * <dd>
     * <p>
     * Matching files are uploaded once the simulation enters the <code>TERMINATING</code> state. Matching files are not
     * uploaded until all of your code (including tools) have stopped.
     * </p>
     * <p>
     * If there is a problem uploading a file, the upload is retried. If problems persist, no further upload attempts
     * will be made.
     * </p>
     * </dd>
     * <dt>UPLOAD_ROLLING_AUTO_REMOVE</dt>
     * <dd>
     * <p>
     * Matching files are uploaded as they are created. They are deleted after they are uploaded. The specified path is
     * checked every 5 seconds. A final check is made when all of your code (including tools) have stopped.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param uploadBehavior
     *        Specifies when to upload the files:</p>
     *        <dl>
     *        <dt>UPLOAD_ON_TERMINATE</dt>
     *        <dd>
     *        <p>
     *        Matching files are uploaded once the simulation enters the <code>TERMINATING</code> state. Matching files
     *        are not uploaded until all of your code (including tools) have stopped.
     *        </p>
     *        <p>
     *        If there is a problem uploading a file, the upload is retried. If problems persist, no further upload
     *        attempts will be made.
     *        </p>
     *        </dd>
     *        <dt>UPLOAD_ROLLING_AUTO_REMOVE</dt>
     *        <dd>
     *        <p>
     *        Matching files are uploaded as they are created. They are deleted after they are uploaded. The specified
     *        path is checked every 5 seconds. A final check is made when all of your code (including tools) have
     *        stopped.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadBehavior
     */

    public UploadConfiguration withUploadBehavior(String uploadBehavior) {
        setUploadBehavior(uploadBehavior);
        return this;
    }

    /**
     * <p>
     * Specifies when to upload the files:
     * </p>
     * <dl>
     * <dt>UPLOAD_ON_TERMINATE</dt>
     * <dd>
     * <p>
     * Matching files are uploaded once the simulation enters the <code>TERMINATING</code> state. Matching files are not
     * uploaded until all of your code (including tools) have stopped.
     * </p>
     * <p>
     * If there is a problem uploading a file, the upload is retried. If problems persist, no further upload attempts
     * will be made.
     * </p>
     * </dd>
     * <dt>UPLOAD_ROLLING_AUTO_REMOVE</dt>
     * <dd>
     * <p>
     * Matching files are uploaded as they are created. They are deleted after they are uploaded. The specified path is
     * checked every 5 seconds. A final check is made when all of your code (including tools) have stopped.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param uploadBehavior
     *        Specifies when to upload the files:</p>
     *        <dl>
     *        <dt>UPLOAD_ON_TERMINATE</dt>
     *        <dd>
     *        <p>
     *        Matching files are uploaded once the simulation enters the <code>TERMINATING</code> state. Matching files
     *        are not uploaded until all of your code (including tools) have stopped.
     *        </p>
     *        <p>
     *        If there is a problem uploading a file, the upload is retried. If problems persist, no further upload
     *        attempts will be made.
     *        </p>
     *        </dd>
     *        <dt>UPLOAD_ROLLING_AUTO_REMOVE</dt>
     *        <dd>
     *        <p>
     *        Matching files are uploaded as they are created. They are deleted after they are uploaded. The specified
     *        path is checked every 5 seconds. A final check is made when all of your code (including tools) have
     *        stopped.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadBehavior
     */

    public UploadConfiguration withUploadBehavior(UploadBehavior uploadBehavior) {
        this.uploadBehavior = uploadBehavior.toString();
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getUploadBehavior() != null)
            sb.append("UploadBehavior: ").append(getUploadBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadConfiguration == false)
            return false;
        UploadConfiguration other = (UploadConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getUploadBehavior() == null ^ this.getUploadBehavior() == null)
            return false;
        if (other.getUploadBehavior() != null && other.getUploadBehavior().equals(this.getUploadBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getUploadBehavior() == null) ? 0 : getUploadBehavior().hashCode());
        return hashCode;
    }

    @Override
    public UploadConfiguration clone() {
        try {
            return (UploadConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.UploadConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
