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
package com.amazonaws.services.ecrpublic.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing the catalog data for a repository. This data is publicly visible in the Amazon ECR Public
 * Gallery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/RepositoryCatalogDataInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryCatalogDataInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A short description of the contents of the repository. This text appears in both the image details and also when
     * searching for repositories on the Amazon ECR Public Gallery.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The system architecture that the images in the repository are compatible with. On the Amazon ECR Public Gallery,
     * the following supported architectures will appear as badges on the repository and are used as search filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Linux</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can
     * be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     * </p>
     * </note>
     */
    private java.util.List<String> architectures;
    /**
     * <p>
     * The operating systems that the images in the repository are compatible with. On the Amazon ECR Public Gallery,
     * the following supported operating systems will appear as badges on the repository and are used as search filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM 64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86-64</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can
     * be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     * </p>
     * </note>
     */
    private java.util.List<String> operatingSystems;
    /**
     * <p>
     * The base64-encoded repository logo payload.
     * </p>
     * <note>
     * <p>
     * The repository logo is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     * </p>
     * </note>
     */
    private java.nio.ByteBuffer logoImageBlob;
    /**
     * <p>
     * A detailed description of the contents of the repository. It is publicly visible in the Amazon ECR Public
     * Gallery. The text must be in markdown format.
     * </p>
     */
    private String aboutText;
    /**
     * <p>
     * Detailed information on how to use the contents of the repository. It is publicly visible in the Amazon ECR
     * Public Gallery. The usage text provides context, support information, and additional usage details for users of
     * the repository. The text must be in markdown format.
     * </p>
     */
    private String usageText;

    /**
     * <p>
     * A short description of the contents of the repository. This text appears in both the image details and also when
     * searching for repositories on the Amazon ECR Public Gallery.
     * </p>
     * 
     * @param description
     *        A short description of the contents of the repository. This text appears in both the image details and
     *        also when searching for repositories on the Amazon ECR Public Gallery.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A short description of the contents of the repository. This text appears in both the image details and also when
     * searching for repositories on the Amazon ECR Public Gallery.
     * </p>
     * 
     * @return A short description of the contents of the repository. This text appears in both the image details and
     *         also when searching for repositories on the Amazon ECR Public Gallery.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A short description of the contents of the repository. This text appears in both the image details and also when
     * searching for repositories on the Amazon ECR Public Gallery.
     * </p>
     * 
     * @param description
     *        A short description of the contents of the repository. This text appears in both the image details and
     *        also when searching for repositories on the Amazon ECR Public Gallery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogDataInput withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The system architecture that the images in the repository are compatible with. On the Amazon ECR Public Gallery,
     * the following supported architectures will appear as badges on the repository and are used as search filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Linux</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can
     * be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     * </p>
     * </note>
     * 
     * @return The system architecture that the images in the repository are compatible with. On the Amazon ECR Public
     *         Gallery, the following supported architectures will appear as badges on the repository and are used as
     *         search filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Linux</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Windows</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If an unsupported tag is added to your repository catalog data, it will be associated with the repository
     *         and can be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     *         </p>
     */

    public java.util.List<String> getArchitectures() {
        return architectures;
    }

    /**
     * <p>
     * The system architecture that the images in the repository are compatible with. On the Amazon ECR Public Gallery,
     * the following supported architectures will appear as badges on the repository and are used as search filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Linux</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can
     * be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     * </p>
     * </note>
     * 
     * @param architectures
     *        The system architecture that the images in the repository are compatible with. On the Amazon ECR Public
     *        Gallery, the following supported architectures will appear as badges on the repository and are used as
     *        search filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Linux</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Windows</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If an unsupported tag is added to your repository catalog data, it will be associated with the repository
     *        and can be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     *        </p>
     */

    public void setArchitectures(java.util.Collection<String> architectures) {
        if (architectures == null) {
            this.architectures = null;
            return;
        }

        this.architectures = new java.util.ArrayList<String>(architectures);
    }

    /**
     * <p>
     * The system architecture that the images in the repository are compatible with. On the Amazon ECR Public Gallery,
     * the following supported architectures will appear as badges on the repository and are used as search filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Linux</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can
     * be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArchitectures(java.util.Collection)} or {@link #withArchitectures(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param architectures
     *        The system architecture that the images in the repository are compatible with. On the Amazon ECR Public
     *        Gallery, the following supported architectures will appear as badges on the repository and are used as
     *        search filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Linux</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Windows</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If an unsupported tag is added to your repository catalog data, it will be associated with the repository
     *        and can be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogDataInput withArchitectures(String... architectures) {
        if (this.architectures == null) {
            setArchitectures(new java.util.ArrayList<String>(architectures.length));
        }
        for (String ele : architectures) {
            this.architectures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The system architecture that the images in the repository are compatible with. On the Amazon ECR Public Gallery,
     * the following supported architectures will appear as badges on the repository and are used as search filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Linux</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can
     * be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     * </p>
     * </note>
     * 
     * @param architectures
     *        The system architecture that the images in the repository are compatible with. On the Amazon ECR Public
     *        Gallery, the following supported architectures will appear as badges on the repository and are used as
     *        search filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Linux</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Windows</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If an unsupported tag is added to your repository catalog data, it will be associated with the repository
     *        and can be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogDataInput withArchitectures(java.util.Collection<String> architectures) {
        setArchitectures(architectures);
        return this;
    }

    /**
     * <p>
     * The operating systems that the images in the repository are compatible with. On the Amazon ECR Public Gallery,
     * the following supported operating systems will appear as badges on the repository and are used as search filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM 64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86-64</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can
     * be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     * </p>
     * </note>
     * 
     * @return The operating systems that the images in the repository are compatible with. On the Amazon ECR Public
     *         Gallery, the following supported operating systems will appear as badges on the repository and are used
     *         as search filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ARM</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ARM 64</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>x86</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>x86-64</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If an unsupported tag is added to your repository catalog data, it will be associated with the repository
     *         and can be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     *         </p>
     */

    public java.util.List<String> getOperatingSystems() {
        return operatingSystems;
    }

    /**
     * <p>
     * The operating systems that the images in the repository are compatible with. On the Amazon ECR Public Gallery,
     * the following supported operating systems will appear as badges on the repository and are used as search filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM 64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86-64</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can
     * be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     * </p>
     * </note>
     * 
     * @param operatingSystems
     *        The operating systems that the images in the repository are compatible with. On the Amazon ECR Public
     *        Gallery, the following supported operating systems will appear as badges on the repository and are used as
     *        search filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ARM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM 64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>x86</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>x86-64</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If an unsupported tag is added to your repository catalog data, it will be associated with the repository
     *        and can be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     *        </p>
     */

    public void setOperatingSystems(java.util.Collection<String> operatingSystems) {
        if (operatingSystems == null) {
            this.operatingSystems = null;
            return;
        }

        this.operatingSystems = new java.util.ArrayList<String>(operatingSystems);
    }

    /**
     * <p>
     * The operating systems that the images in the repository are compatible with. On the Amazon ECR Public Gallery,
     * the following supported operating systems will appear as badges on the repository and are used as search filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM 64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86-64</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can
     * be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingSystems(java.util.Collection)} or {@link #withOperatingSystems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param operatingSystems
     *        The operating systems that the images in the repository are compatible with. On the Amazon ECR Public
     *        Gallery, the following supported operating systems will appear as badges on the repository and are used as
     *        search filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ARM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM 64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>x86</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>x86-64</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If an unsupported tag is added to your repository catalog data, it will be associated with the repository
     *        and can be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogDataInput withOperatingSystems(String... operatingSystems) {
        if (this.operatingSystems == null) {
            setOperatingSystems(new java.util.ArrayList<String>(operatingSystems.length));
        }
        for (String ele : operatingSystems) {
            this.operatingSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The operating systems that the images in the repository are compatible with. On the Amazon ECR Public Gallery,
     * the following supported operating systems will appear as badges on the repository and are used as search filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM 64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86-64</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an unsupported tag is added to your repository catalog data, it will be associated with the repository and can
     * be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     * </p>
     * </note>
     * 
     * @param operatingSystems
     *        The operating systems that the images in the repository are compatible with. On the Amazon ECR Public
     *        Gallery, the following supported operating systems will appear as badges on the repository and are used as
     *        search filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ARM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM 64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>x86</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>x86-64</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If an unsupported tag is added to your repository catalog data, it will be associated with the repository
     *        and can be retrieved using the API but will not be discoverable in the Amazon ECR Public Gallery.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogDataInput withOperatingSystems(java.util.Collection<String> operatingSystems) {
        setOperatingSystems(operatingSystems);
        return this;
    }

    /**
     * <p>
     * The base64-encoded repository logo payload.
     * </p>
     * <note>
     * <p>
     * The repository logo is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     * </p>
     * </note>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param logoImageBlob
     *        The base64-encoded repository logo payload.</p> <note>
     *        <p>
     *        The repository logo is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     *        </p>
     */

    public void setLogoImageBlob(java.nio.ByteBuffer logoImageBlob) {
        this.logoImageBlob = logoImageBlob;
    }

    /**
     * <p>
     * The base64-encoded repository logo payload.
     * </p>
     * <note>
     * <p>
     * The repository logo is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     * </p>
     * </note>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The base64-encoded repository logo payload.</p> <note>
     *         <p>
     *         The repository logo is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     *         </p>
     */

    public java.nio.ByteBuffer getLogoImageBlob() {
        return this.logoImageBlob;
    }

    /**
     * <p>
     * The base64-encoded repository logo payload.
     * </p>
     * <note>
     * <p>
     * The repository logo is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     * </p>
     * </note>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param logoImageBlob
     *        The base64-encoded repository logo payload.</p> <note>
     *        <p>
     *        The repository logo is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogDataInput withLogoImageBlob(java.nio.ByteBuffer logoImageBlob) {
        setLogoImageBlob(logoImageBlob);
        return this;
    }

    /**
     * <p>
     * A detailed description of the contents of the repository. It is publicly visible in the Amazon ECR Public
     * Gallery. The text must be in markdown format.
     * </p>
     * 
     * @param aboutText
     *        A detailed description of the contents of the repository. It is publicly visible in the Amazon ECR Public
     *        Gallery. The text must be in markdown format.
     */

    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }

    /**
     * <p>
     * A detailed description of the contents of the repository. It is publicly visible in the Amazon ECR Public
     * Gallery. The text must be in markdown format.
     * </p>
     * 
     * @return A detailed description of the contents of the repository. It is publicly visible in the Amazon ECR Public
     *         Gallery. The text must be in markdown format.
     */

    public String getAboutText() {
        return this.aboutText;
    }

    /**
     * <p>
     * A detailed description of the contents of the repository. It is publicly visible in the Amazon ECR Public
     * Gallery. The text must be in markdown format.
     * </p>
     * 
     * @param aboutText
     *        A detailed description of the contents of the repository. It is publicly visible in the Amazon ECR Public
     *        Gallery. The text must be in markdown format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogDataInput withAboutText(String aboutText) {
        setAboutText(aboutText);
        return this;
    }

    /**
     * <p>
     * Detailed information on how to use the contents of the repository. It is publicly visible in the Amazon ECR
     * Public Gallery. The usage text provides context, support information, and additional usage details for users of
     * the repository. The text must be in markdown format.
     * </p>
     * 
     * @param usageText
     *        Detailed information on how to use the contents of the repository. It is publicly visible in the Amazon
     *        ECR Public Gallery. The usage text provides context, support information, and additional usage details for
     *        users of the repository. The text must be in markdown format.
     */

    public void setUsageText(String usageText) {
        this.usageText = usageText;
    }

    /**
     * <p>
     * Detailed information on how to use the contents of the repository. It is publicly visible in the Amazon ECR
     * Public Gallery. The usage text provides context, support information, and additional usage details for users of
     * the repository. The text must be in markdown format.
     * </p>
     * 
     * @return Detailed information on how to use the contents of the repository. It is publicly visible in the Amazon
     *         ECR Public Gallery. The usage text provides context, support information, and additional usage details
     *         for users of the repository. The text must be in markdown format.
     */

    public String getUsageText() {
        return this.usageText;
    }

    /**
     * <p>
     * Detailed information on how to use the contents of the repository. It is publicly visible in the Amazon ECR
     * Public Gallery. The usage text provides context, support information, and additional usage details for users of
     * the repository. The text must be in markdown format.
     * </p>
     * 
     * @param usageText
     *        Detailed information on how to use the contents of the repository. It is publicly visible in the Amazon
     *        ECR Public Gallery. The usage text provides context, support information, and additional usage details for
     *        users of the repository. The text must be in markdown format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogDataInput withUsageText(String usageText) {
        setUsageText(usageText);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getArchitectures() != null)
            sb.append("Architectures: ").append(getArchitectures()).append(",");
        if (getOperatingSystems() != null)
            sb.append("OperatingSystems: ").append(getOperatingSystems()).append(",");
        if (getLogoImageBlob() != null)
            sb.append("LogoImageBlob: ").append(getLogoImageBlob()).append(",");
        if (getAboutText() != null)
            sb.append("AboutText: ").append(getAboutText()).append(",");
        if (getUsageText() != null)
            sb.append("UsageText: ").append(getUsageText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryCatalogDataInput == false)
            return false;
        RepositoryCatalogDataInput other = (RepositoryCatalogDataInput) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getArchitectures() == null ^ this.getArchitectures() == null)
            return false;
        if (other.getArchitectures() != null && other.getArchitectures().equals(this.getArchitectures()) == false)
            return false;
        if (other.getOperatingSystems() == null ^ this.getOperatingSystems() == null)
            return false;
        if (other.getOperatingSystems() != null && other.getOperatingSystems().equals(this.getOperatingSystems()) == false)
            return false;
        if (other.getLogoImageBlob() == null ^ this.getLogoImageBlob() == null)
            return false;
        if (other.getLogoImageBlob() != null && other.getLogoImageBlob().equals(this.getLogoImageBlob()) == false)
            return false;
        if (other.getAboutText() == null ^ this.getAboutText() == null)
            return false;
        if (other.getAboutText() != null && other.getAboutText().equals(this.getAboutText()) == false)
            return false;
        if (other.getUsageText() == null ^ this.getUsageText() == null)
            return false;
        if (other.getUsageText() != null && other.getUsageText().equals(this.getUsageText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getArchitectures() == null) ? 0 : getArchitectures().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystems() == null) ? 0 : getOperatingSystems().hashCode());
        hashCode = prime * hashCode + ((getLogoImageBlob() == null) ? 0 : getLogoImageBlob().hashCode());
        hashCode = prime * hashCode + ((getAboutText() == null) ? 0 : getAboutText().hashCode());
        hashCode = prime * hashCode + ((getUsageText() == null) ? 0 : getUsageText().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryCatalogDataInput clone() {
        try {
            return (RepositoryCatalogDataInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecrpublic.model.transform.RepositoryCatalogDataInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
