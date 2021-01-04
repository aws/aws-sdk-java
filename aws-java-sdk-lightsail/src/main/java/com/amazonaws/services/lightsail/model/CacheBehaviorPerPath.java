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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the per-path cache behavior of an Amazon Lightsail content delivery network (CDN) distribution.
 * </p>
 * <p>
 * A per-path cache behavior is used to override, or add an exception to, the default cache behavior of a distribution.
 * For example, if the <code>cacheBehavior</code> is set to <code>cache</code>, then a per-path cache behavior can be
 * used to specify a directory, file, or file type that your distribution will cache. Alternately, if the distribution's
 * <code>cacheBehavior</code> is <code>dont-cache</code>, then a per-path cache behavior can be used to specify a
 * directory, file, or file type that your distribution will not cache.
 * </p>
 * <p>
 * if the cacheBehavior's behavior is set to 'cache', then
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CacheBehaviorPerPath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheBehaviorPerPath implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to a directory or file to cached, or not cache. Use an asterisk symbol to specify wildcard directories (
     * <code>path/to/assets/*</code>), and file types (<code>*.html, *jpg, *js</code>). Directories and file paths are
     * case-sensitive.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following to cache all files in the document root of an Apache web server running on a Lightsail
     * instance.
     * </p>
     * <p>
     * <code>var/www/html/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following file to cache only the index page in the document root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/index.html</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following to cache only the .html files in the document root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/*.html</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following to cache only the .jpg, .png, and .gif files in the images sub-directory of the document
     * root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/images/*.jpg</code>
     * </p>
     * <p>
     * <code>var/www/html/images/*.png</code>
     * </p>
     * <p>
     * <code>var/www/html/images/*.gif</code>
     * </p>
     * <p>
     * Specify the following to cache all files in the images sub-directory of the document root of an Apache web
     * server.
     * </p>
     * <p>
     * <code>var/www/html/images/</code>
     * </p>
     * </li>
     * </ul>
     */
    private String path;
    /**
     * <p>
     * The cache behavior for the specified path.
     * </p>
     * <p>
     * You can specify one of the following per-path cache behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>cache</code> </b> - This behavior caches the specified path.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>dont-cache</code> </b> - This behavior doesn't cache the specified path.
     * </p>
     * </li>
     * </ul>
     */
    private String behavior;

    /**
     * <p>
     * The path to a directory or file to cached, or not cache. Use an asterisk symbol to specify wildcard directories (
     * <code>path/to/assets/*</code>), and file types (<code>*.html, *jpg, *js</code>). Directories and file paths are
     * case-sensitive.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following to cache all files in the document root of an Apache web server running on a Lightsail
     * instance.
     * </p>
     * <p>
     * <code>var/www/html/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following file to cache only the index page in the document root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/index.html</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following to cache only the .html files in the document root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/*.html</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following to cache only the .jpg, .png, and .gif files in the images sub-directory of the document
     * root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/images/*.jpg</code>
     * </p>
     * <p>
     * <code>var/www/html/images/*.png</code>
     * </p>
     * <p>
     * <code>var/www/html/images/*.gif</code>
     * </p>
     * <p>
     * Specify the following to cache all files in the images sub-directory of the document root of an Apache web
     * server.
     * </p>
     * <p>
     * <code>var/www/html/images/</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param path
     *        The path to a directory or file to cached, or not cache. Use an asterisk symbol to specify wildcard
     *        directories (<code>path/to/assets/*</code>), and file types (<code>*.html, *jpg, *js</code>). Directories
     *        and file paths are case-sensitive.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify the following to cache all files in the document root of an Apache web server running on a
     *        Lightsail instance.
     *        </p>
     *        <p>
     *        <code>var/www/html/</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify the following file to cache only the index page in the document root of an Apache web server.
     *        </p>
     *        <p>
     *        <code>var/www/html/index.html</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify the following to cache only the .html files in the document root of an Apache web server.
     *        </p>
     *        <p>
     *        <code>var/www/html/*.html</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify the following to cache only the .jpg, .png, and .gif files in the images sub-directory of the
     *        document root of an Apache web server.
     *        </p>
     *        <p>
     *        <code>var/www/html/images/*.jpg</code>
     *        </p>
     *        <p>
     *        <code>var/www/html/images/*.png</code>
     *        </p>
     *        <p>
     *        <code>var/www/html/images/*.gif</code>
     *        </p>
     *        <p>
     *        Specify the following to cache all files in the images sub-directory of the document root of an Apache web
     *        server.
     *        </p>
     *        <p>
     *        <code>var/www/html/images/</code>
     *        </p>
     *        </li>
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to a directory or file to cached, or not cache. Use an asterisk symbol to specify wildcard directories (
     * <code>path/to/assets/*</code>), and file types (<code>*.html, *jpg, *js</code>). Directories and file paths are
     * case-sensitive.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following to cache all files in the document root of an Apache web server running on a Lightsail
     * instance.
     * </p>
     * <p>
     * <code>var/www/html/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following file to cache only the index page in the document root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/index.html</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following to cache only the .html files in the document root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/*.html</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following to cache only the .jpg, .png, and .gif files in the images sub-directory of the document
     * root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/images/*.jpg</code>
     * </p>
     * <p>
     * <code>var/www/html/images/*.png</code>
     * </p>
     * <p>
     * <code>var/www/html/images/*.gif</code>
     * </p>
     * <p>
     * Specify the following to cache all files in the images sub-directory of the document root of an Apache web
     * server.
     * </p>
     * <p>
     * <code>var/www/html/images/</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The path to a directory or file to cached, or not cache. Use an asterisk symbol to specify wildcard
     *         directories (<code>path/to/assets/*</code>), and file types (<code>*.html, *jpg, *js</code>). Directories
     *         and file paths are case-sensitive.</p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify the following to cache all files in the document root of an Apache web server running on a
     *         Lightsail instance.
     *         </p>
     *         <p>
     *         <code>var/www/html/</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify the following file to cache only the index page in the document root of an Apache web server.
     *         </p>
     *         <p>
     *         <code>var/www/html/index.html</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify the following to cache only the .html files in the document root of an Apache web server.
     *         </p>
     *         <p>
     *         <code>var/www/html/*.html</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify the following to cache only the .jpg, .png, and .gif files in the images sub-directory of the
     *         document root of an Apache web server.
     *         </p>
     *         <p>
     *         <code>var/www/html/images/*.jpg</code>
     *         </p>
     *         <p>
     *         <code>var/www/html/images/*.png</code>
     *         </p>
     *         <p>
     *         <code>var/www/html/images/*.gif</code>
     *         </p>
     *         <p>
     *         Specify the following to cache all files in the images sub-directory of the document root of an Apache
     *         web server.
     *         </p>
     *         <p>
     *         <code>var/www/html/images/</code>
     *         </p>
     *         </li>
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to a directory or file to cached, or not cache. Use an asterisk symbol to specify wildcard directories (
     * <code>path/to/assets/*</code>), and file types (<code>*.html, *jpg, *js</code>). Directories and file paths are
     * case-sensitive.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following to cache all files in the document root of an Apache web server running on a Lightsail
     * instance.
     * </p>
     * <p>
     * <code>var/www/html/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following file to cache only the index page in the document root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/index.html</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following to cache only the .html files in the document root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/*.html</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the following to cache only the .jpg, .png, and .gif files in the images sub-directory of the document
     * root of an Apache web server.
     * </p>
     * <p>
     * <code>var/www/html/images/*.jpg</code>
     * </p>
     * <p>
     * <code>var/www/html/images/*.png</code>
     * </p>
     * <p>
     * <code>var/www/html/images/*.gif</code>
     * </p>
     * <p>
     * Specify the following to cache all files in the images sub-directory of the document root of an Apache web
     * server.
     * </p>
     * <p>
     * <code>var/www/html/images/</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param path
     *        The path to a directory or file to cached, or not cache. Use an asterisk symbol to specify wildcard
     *        directories (<code>path/to/assets/*</code>), and file types (<code>*.html, *jpg, *js</code>). Directories
     *        and file paths are case-sensitive.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify the following to cache all files in the document root of an Apache web server running on a
     *        Lightsail instance.
     *        </p>
     *        <p>
     *        <code>var/www/html/</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify the following file to cache only the index page in the document root of an Apache web server.
     *        </p>
     *        <p>
     *        <code>var/www/html/index.html</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify the following to cache only the .html files in the document root of an Apache web server.
     *        </p>
     *        <p>
     *        <code>var/www/html/*.html</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify the following to cache only the .jpg, .png, and .gif files in the images sub-directory of the
     *        document root of an Apache web server.
     *        </p>
     *        <p>
     *        <code>var/www/html/images/*.jpg</code>
     *        </p>
     *        <p>
     *        <code>var/www/html/images/*.png</code>
     *        </p>
     *        <p>
     *        <code>var/www/html/images/*.gif</code>
     *        </p>
     *        <p>
     *        Specify the following to cache all files in the images sub-directory of the document root of an Apache web
     *        server.
     *        </p>
     *        <p>
     *        <code>var/www/html/images/</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehaviorPerPath withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The cache behavior for the specified path.
     * </p>
     * <p>
     * You can specify one of the following per-path cache behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>cache</code> </b> - This behavior caches the specified path.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>dont-cache</code> </b> - This behavior doesn't cache the specified path.
     * </p>
     * </li>
     * </ul>
     * 
     * @param behavior
     *        The cache behavior for the specified path.</p>
     *        <p>
     *        You can specify one of the following per-path cache behaviors:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>cache</code> </b> - This behavior caches the specified path.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>dont-cache</code> </b> - This behavior doesn't cache the specified path.
     *        </p>
     *        </li>
     * @see BehaviorEnum
     */

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * The cache behavior for the specified path.
     * </p>
     * <p>
     * You can specify one of the following per-path cache behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>cache</code> </b> - This behavior caches the specified path.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>dont-cache</code> </b> - This behavior doesn't cache the specified path.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The cache behavior for the specified path.</p>
     *         <p>
     *         You can specify one of the following per-path cache behaviors:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>cache</code> </b> - This behavior caches the specified path.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>dont-cache</code> </b> - This behavior doesn't cache the specified path.
     *         </p>
     *         </li>
     * @see BehaviorEnum
     */

    public String getBehavior() {
        return this.behavior;
    }

    /**
     * <p>
     * The cache behavior for the specified path.
     * </p>
     * <p>
     * You can specify one of the following per-path cache behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>cache</code> </b> - This behavior caches the specified path.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>dont-cache</code> </b> - This behavior doesn't cache the specified path.
     * </p>
     * </li>
     * </ul>
     * 
     * @param behavior
     *        The cache behavior for the specified path.</p>
     *        <p>
     *        You can specify one of the following per-path cache behaviors:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>cache</code> </b> - This behavior caches the specified path.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>dont-cache</code> </b> - This behavior doesn't cache the specified path.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorEnum
     */

    public CacheBehaviorPerPath withBehavior(String behavior) {
        setBehavior(behavior);
        return this;
    }

    /**
     * <p>
     * The cache behavior for the specified path.
     * </p>
     * <p>
     * You can specify one of the following per-path cache behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>cache</code> </b> - This behavior caches the specified path.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>dont-cache</code> </b> - This behavior doesn't cache the specified path.
     * </p>
     * </li>
     * </ul>
     * 
     * @param behavior
     *        The cache behavior for the specified path.</p>
     *        <p>
     *        You can specify one of the following per-path cache behaviors:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>cache</code> </b> - This behavior caches the specified path.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>dont-cache</code> </b> - This behavior doesn't cache the specified path.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorEnum
     */

    public CacheBehaviorPerPath withBehavior(BehaviorEnum behavior) {
        this.behavior = behavior.toString();
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getBehavior() != null)
            sb.append("Behavior: ").append(getBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheBehaviorPerPath == false)
            return false;
        CacheBehaviorPerPath other = (CacheBehaviorPerPath) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getBehavior() == null ^ this.getBehavior() == null)
            return false;
        if (other.getBehavior() != null && other.getBehavior().equals(this.getBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getBehavior() == null) ? 0 : getBehavior().hashCode());
        return hashCode;
    }

    @Override
    public CacheBehaviorPerPath clone() {
        try {
            return (CacheBehaviorPerPath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.CacheBehaviorPerPathMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
