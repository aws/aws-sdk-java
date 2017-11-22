/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;

/**
 * Interface for accessing Amazon Rekognition asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.rekognition.AbstractAmazonRekognitionAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the Amazon Rekognition API reference.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRekognitionAsync extends AmazonRekognition {

    /**
     * <p>
     * Compares a face in the <i>source</i> input image with each of the 100 largest faces detected in the <i>target</i>
     * input image.
     * </p>
     * <note>
     * <p>
     * If the source image contains multiple faces, the service detects the largest face and compares it with each face
     * detected in the target image.
     * </p>
     * </note>
     * <p>
     * You pass the input and target images either as base64-encoded image bytes or as a references to images in an
     * Amazon S3 bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * In response, the operation returns an array of face matches ordered by similarity score in descending order. For
     * each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role,
     * and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the
     * bounding box contains a face). The response also provides a similarity score, which indicates how closely the
     * faces match.
     * </p>
     * <note>
     * <p>
     * By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You
     * can change this value by specifying the <code>SimilarityThreshold</code> parameter.
     * </p>
     * </note>
     * <p>
     * <code>CompareFaces</code> also returns an array of faces that don't match the source image. For each face, it
     * returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns
     * information about the face in the source image, including the bounding box of the face and confidence value.
     * </p>
     * <p>
     * If the image doesn't contain Exif metadata, <code>CompareFaces</code> returns orientation information for the
     * source and target images. Use these values to display the images with the correct image orientation.
     * </p>
     * <p>
     * If no faces are detected in the source or target images, <code>CompareFaces</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, data returned by this operation doesn't persist.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>get-started-exercise-compare-faces</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CompareFaces</code> action.
     * </p>
     * 
     * @param compareFacesRequest
     * @return A Java Future containing the result of the CompareFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.CompareFaces
     */
    java.util.concurrent.Future<CompareFacesResult> compareFacesAsync(CompareFacesRequest compareFacesRequest);

    /**
     * <p>
     * Compares a face in the <i>source</i> input image with each of the 100 largest faces detected in the <i>target</i>
     * input image.
     * </p>
     * <note>
     * <p>
     * If the source image contains multiple faces, the service detects the largest face and compares it with each face
     * detected in the target image.
     * </p>
     * </note>
     * <p>
     * You pass the input and target images either as base64-encoded image bytes or as a references to images in an
     * Amazon S3 bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * In response, the operation returns an array of face matches ordered by similarity score in descending order. For
     * each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role,
     * and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the
     * bounding box contains a face). The response also provides a similarity score, which indicates how closely the
     * faces match.
     * </p>
     * <note>
     * <p>
     * By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You
     * can change this value by specifying the <code>SimilarityThreshold</code> parameter.
     * </p>
     * </note>
     * <p>
     * <code>CompareFaces</code> also returns an array of faces that don't match the source image. For each face, it
     * returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns
     * information about the face in the source image, including the bounding box of the face and confidence value.
     * </p>
     * <p>
     * If the image doesn't contain Exif metadata, <code>CompareFaces</code> returns orientation information for the
     * source and target images. Use these values to display the images with the correct image orientation.
     * </p>
     * <p>
     * If no faces are detected in the source or target images, <code>CompareFaces</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, data returned by this operation doesn't persist.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>get-started-exercise-compare-faces</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CompareFaces</code> action.
     * </p>
     * 
     * @param compareFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompareFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.CompareFaces
     */
    java.util.concurrent.Future<CompareFacesResult> compareFacesAsync(CompareFacesRequest compareFacesRequest,
            com.amazonaws.handlers.AsyncHandler<CompareFacesRequest, CompareFacesResult> asyncHandler);

    /**
     * <p>
     * Creates a collection in an AWS Region. You can add faces to the collection using the operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your application users. A user can then index faces
     * using the <code>IndexFaces</code> operation and persist results in a specific collection. Then, a user can search
     * the collection for faces in the user-specific container.
     * </p>
     * <note>
     * <p>
     * Collection names are case-sensitive.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateCollection</code> action.
     * </p>
     * 
     * @param createCollectionRequest
     * @return A Java Future containing the result of the CreateCollection operation returned by the service.
     * @sample AmazonRekognitionAsync.CreateCollection
     */
    java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest createCollectionRequest);

    /**
     * <p>
     * Creates a collection in an AWS Region. You can add faces to the collection using the operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your application users. A user can then index faces
     * using the <code>IndexFaces</code> operation and persist results in a specific collection. Then, a user can search
     * the collection for faces in the user-specific container.
     * </p>
     * <note>
     * <p>
     * Collection names are case-sensitive.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateCollection</code> action.
     * </p>
     * 
     * @param createCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCollection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.CreateCollection
     */
    java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest createCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCollectionRequest, CreateCollectionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example,
     * see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteCollection</code> action.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @return A Java Future containing the result of the DeleteCollection operation returned by the service.
     * @sample AmazonRekognitionAsync.DeleteCollection
     */
    java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest deleteCollectionRequest);

    /**
     * <p>
     * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example,
     * see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteCollection</code> action.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCollection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DeleteCollection
     */
    java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest deleteCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCollectionRequest, DeleteCollectionResult> asyncHandler);

    /**
     * <p>
     * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the
     * collection.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteFaces</code> action.
     * </p>
     * 
     * @param deleteFacesRequest
     * @return A Java Future containing the result of the DeleteFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.DeleteFaces
     */
    java.util.concurrent.Future<DeleteFacesResult> deleteFacesAsync(DeleteFacesRequest deleteFacesRequest);

    /**
     * <p>
     * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the
     * collection.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteFaces</code> action.
     * </p>
     * 
     * @param deleteFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DeleteFaces
     */
    java.util.concurrent.Future<DeleteFacesResult> deleteFacesAsync(DeleteFacesRequest deleteFacesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFacesRequest, DeleteFacesResult> asyncHandler);

    /**
     * <p>
     * Detects faces within an image that is provided as input.
     * </p>
     * <p>
     * <code>DetectFaces</code> detects the 100 largest faces in the image. For each face detected, the operation
     * returns face details including a bounding box of the face, a confidence value (that the bounding box contains a
     * face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and mouth),
     * gender, presence of beard, sunglasses, etc.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm
     * may not detect the faces or might detect faces with lower confidence.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>get-started-exercise-detect-faces</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectFaces</code> action.
     * </p>
     * 
     * @param detectFacesRequest
     * @return A Java Future containing the result of the DetectFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectFaces
     */
    java.util.concurrent.Future<DetectFacesResult> detectFacesAsync(DetectFacesRequest detectFacesRequest);

    /**
     * <p>
     * Detects faces within an image that is provided as input.
     * </p>
     * <p>
     * <code>DetectFaces</code> detects the 100 largest faces in the image. For each face detected, the operation
     * returns face details including a bounding box of the face, a confidence value (that the bounding box contains a
     * face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and mouth),
     * gender, presence of beard, sunglasses, etc.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm
     * may not detect the faces or might detect faces with lower confidence.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>get-started-exercise-detect-faces</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectFaces</code> action.
     * </p>
     * 
     * @param detectFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectFaces
     */
    java.util.concurrent.Future<DetectFacesResult> detectFacesAsync(DetectFacesRequest detectFacesRequest,
            com.amazonaws.handlers.AsyncHandler<DetectFacesRequest, DetectFacesResult> asyncHandler);

    /**
     * <p>
     * Detects instances of real-world labels within an image (JPEG or PNG) provided as input. This includes objects
     * like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape,
     * evening, and nature. For an example, see <a>get-started-exercise-detect-labels</a>.
     * </p>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If
     * you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image
     * must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and
     * the level of confidence that the image contains the object. For example, suppose the input image has a
     * lighthouse, the sea, and a rock. The response will include all three labels, one for each object.
     * </p>
     * <p>
     * <code>{Name: lighthouse, Confidence: 98.4629}</code>
     * </p>
     * <p>
     * <code>{Name: rock,Confidence: 79.2097}</code>
     * </p>
     * <p>
     * <code> {Name: sea,Confidence: 75.061}</code>
     * </p>
     * <p>
     * In the preceding example, the operation returns one label for each of the three objects. The operation can also
     * return multiple labels for the same object in the image. For example, if the input image shows a flower (for
     * example, a tulip), the operation might return the following three labels.
     * </p>
     * <p>
     * <code>{Name: flower,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: plant,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: tulip,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * In this example, the detection algorithm more precisely identifies the flower as a tulip.
     * </p>
     * <p>
     * In response, the API returns an array of labels. In addition, the response also includes the orientation
     * correction. Optionally, you can specify <code>MinConfidence</code> to control the confidence threshold for the
     * labels returned. The default is 50%. You can also add the <code>MaxLabels</code> parameter to limit the number of
     * labels returned.
     * </p>
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the same facial details that the
     * <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectLabels</code> action.
     * </p>
     * 
     * @param detectLabelsRequest
     * @return A Java Future containing the result of the DetectLabels operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectLabels
     */
    java.util.concurrent.Future<DetectLabelsResult> detectLabelsAsync(DetectLabelsRequest detectLabelsRequest);

    /**
     * <p>
     * Detects instances of real-world labels within an image (JPEG or PNG) provided as input. This includes objects
     * like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape,
     * evening, and nature. For an example, see <a>get-started-exercise-detect-labels</a>.
     * </p>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If
     * you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image
     * must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and
     * the level of confidence that the image contains the object. For example, suppose the input image has a
     * lighthouse, the sea, and a rock. The response will include all three labels, one for each object.
     * </p>
     * <p>
     * <code>{Name: lighthouse, Confidence: 98.4629}</code>
     * </p>
     * <p>
     * <code>{Name: rock,Confidence: 79.2097}</code>
     * </p>
     * <p>
     * <code> {Name: sea,Confidence: 75.061}</code>
     * </p>
     * <p>
     * In the preceding example, the operation returns one label for each of the three objects. The operation can also
     * return multiple labels for the same object in the image. For example, if the input image shows a flower (for
     * example, a tulip), the operation might return the following three labels.
     * </p>
     * <p>
     * <code>{Name: flower,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: plant,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: tulip,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * In this example, the detection algorithm more precisely identifies the flower as a tulip.
     * </p>
     * <p>
     * In response, the API returns an array of labels. In addition, the response also includes the orientation
     * correction. Optionally, you can specify <code>MinConfidence</code> to control the confidence threshold for the
     * labels returned. The default is 50%. You can also add the <code>MaxLabels</code> parameter to limit the number of
     * labels returned.
     * </p>
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the same facial details that the
     * <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectLabels</code> action.
     * </p>
     * 
     * @param detectLabelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectLabels operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectLabels
     */
    java.util.concurrent.Future<DetectLabelsResult> detectLabelsAsync(DetectLabelsRequest detectLabelsRequest,
            com.amazonaws.handlers.AsyncHandler<DetectLabelsRequest, DetectLabelsResult> asyncHandler);

    /**
     * <p>
     * Detects explicit or suggestive adult content in a specified JPEG or PNG format image. Use
     * <code>DetectModerationLabels</code> to moderate images depending on your requirements. For example, you might
     * want to filter images that contain nudity, but not images containing suggestive content.
     * </p>
     * <p>
     * To filter images, use the labels returned by <code>DetectModerationLabels</code> to determine which types of
     * content are appropriate. For information about moderation labels, see <a>image-moderation</a>.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * 
     * @param detectModerationLabelsRequest
     * @return A Java Future containing the result of the DetectModerationLabels operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectModerationLabels
     */
    java.util.concurrent.Future<DetectModerationLabelsResult> detectModerationLabelsAsync(DetectModerationLabelsRequest detectModerationLabelsRequest);

    /**
     * <p>
     * Detects explicit or suggestive adult content in a specified JPEG or PNG format image. Use
     * <code>DetectModerationLabels</code> to moderate images depending on your requirements. For example, you might
     * want to filter images that contain nudity, but not images containing suggestive content.
     * </p>
     * <p>
     * To filter images, use the labels returned by <code>DetectModerationLabels</code> to determine which types of
     * content are appropriate. For information about moderation labels, see <a>image-moderation</a>.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * 
     * @param detectModerationLabelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectModerationLabels operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectModerationLabels
     */
    java.util.concurrent.Future<DetectModerationLabelsResult> detectModerationLabelsAsync(DetectModerationLabelsRequest detectModerationLabelsRequest,
            com.amazonaws.handlers.AsyncHandler<DetectModerationLabelsRequest, DetectModerationLabelsResult> asyncHandler);

    /**
     * <p>
     * Detects text in the input image and converts it into machine-readable text.
     * </p>
     * <p>
     * Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you
     * use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon
     * S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg
     * formatted file.
     * </p>
     * <p>
     * The <code>DetectText</code> operation returns text in an array of elements, <code>TextDetections</code>. Each
     * <code>TextDetection</code> element provides information about a single word or line of text that was detected in
     * the image.
     * </p>
     * <p>
     * A word is one or more ISO basic latin script characters that are not separated by spaces. <code>DetectText</code>
     * can detect up to 50 words in an image.
     * </p>
     * <p>
     * A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's
     * license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when
     * there is a large gap between words, relative to the length of the words. This means, depending on the gap between
     * words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't
     * represent the end of a line. If a sentence spans multiple lines, the <code>DetectText</code> operation returns
     * multiple lines.
     * </p>
     * <p>
     * To determine whether a <code>TextDetection</code> element is a line of text or a word, use the
     * <code>TextDetection</code> object <code>Type</code> field.
     * </p>
     * <p>
     * To be detected, text must be within +/- 30 degrees orientation of the horizontal axis.
     * </p>
     * <p>
     * For more information, see <a>text-detection</a>.
     * </p>
     * 
     * @param detectTextRequest
     * @return A Java Future containing the result of the DetectText operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectText
     */
    java.util.concurrent.Future<DetectTextResult> detectTextAsync(DetectTextRequest detectTextRequest);

    /**
     * <p>
     * Detects text in the input image and converts it into machine-readable text.
     * </p>
     * <p>
     * Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you
     * use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon
     * S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg
     * formatted file.
     * </p>
     * <p>
     * The <code>DetectText</code> operation returns text in an array of elements, <code>TextDetections</code>. Each
     * <code>TextDetection</code> element provides information about a single word or line of text that was detected in
     * the image.
     * </p>
     * <p>
     * A word is one or more ISO basic latin script characters that are not separated by spaces. <code>DetectText</code>
     * can detect up to 50 words in an image.
     * </p>
     * <p>
     * A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's
     * license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when
     * there is a large gap between words, relative to the length of the words. This means, depending on the gap between
     * words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't
     * represent the end of a line. If a sentence spans multiple lines, the <code>DetectText</code> operation returns
     * multiple lines.
     * </p>
     * <p>
     * To determine whether a <code>TextDetection</code> element is a line of text or a word, use the
     * <code>TextDetection</code> object <code>Type</code> field.
     * </p>
     * <p>
     * To be detected, text must be within +/- 30 degrees orientation of the horizontal axis.
     * </p>
     * <p>
     * For more information, see <a>text-detection</a>.
     * </p>
     * 
     * @param detectTextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectText operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectText
     */
    java.util.concurrent.Future<DetectTextResult> detectTextAsync(DetectTextRequest detectTextRequest,
            com.amazonaws.handlers.AsyncHandler<DetectTextRequest, DetectTextResult> asyncHandler);

    /**
     * <p>
     * Gets the name and additional information about a celebrity based on his or her Rekognition ID. The additional
     * information is returned as an array of URLs. If there is no additional information about the celebrity, this list
     * is empty. For more information, see <a>celebrity-recognition</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:GetCelebrityInfo</code> action.
     * </p>
     * 
     * @param getCelebrityInfoRequest
     * @return A Java Future containing the result of the GetCelebrityInfo operation returned by the service.
     * @sample AmazonRekognitionAsync.GetCelebrityInfo
     */
    java.util.concurrent.Future<GetCelebrityInfoResult> getCelebrityInfoAsync(GetCelebrityInfoRequest getCelebrityInfoRequest);

    /**
     * <p>
     * Gets the name and additional information about a celebrity based on his or her Rekognition ID. The additional
     * information is returned as an array of URLs. If there is no additional information about the celebrity, this list
     * is empty. For more information, see <a>celebrity-recognition</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:GetCelebrityInfo</code> action.
     * </p>
     * 
     * @param getCelebrityInfoRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCelebrityInfo operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.GetCelebrityInfo
     */
    java.util.concurrent.Future<GetCelebrityInfoResult> getCelebrityInfoAsync(GetCelebrityInfoRequest getCelebrityInfoRequest,
            com.amazonaws.handlers.AsyncHandler<GetCelebrityInfoRequest, GetCelebrityInfoResult> asyncHandler);

    /**
     * <p>
     * Detects faces in the input image and adds them to the specified collection.
     * </p>
     * <p>
     * Amazon Rekognition does not save the actual faces detected. Instead, the underlying detection algorithm first
     * detects the faces in the input image, and for each face extracts facial features into a feature vector, and
     * stores it in the back-end database. Amazon Rekognition uses feature vectors when performing face match and search
     * operations using the and operations.
     * </p>
     * <p>
     * If you are using version 1.0 of the face detection model, <code>IndexFaces</code> indexes the 15 largest faces in
     * the input image. Later versions of the face detection model index the 100 largest faces in the input image. To
     * determine which version of the model you are using, check the the value of <code>FaceModelVersion</code> in the
     * response from <code>IndexFaces</code>. For more information, see <a>face-detection-model</a>.
     * </p>
     * <p>
     * If you provide the optional <code>ExternalImageID</code> for the input image you provided, Amazon Rekognition
     * associates this ID with all faces that it detects. When you call the operation, the response returns the external
     * ID. You can use this external image ID to create a client-side index to associate the faces with each image. You
     * can then use the index to find all faces in an image.
     * </p>
     * <p>
     * In response, the operation returns an array of metadata for all detected faces. This includes, the bounding box
     * of the detected face, confidence value (indicating the bounding box contains a face), a face ID assigned by the
     * service for each face that is detected and stored, and an image ID assigned by the service for the input image.
     * If you request all facial attributes (using the <code>detectionAttributes</code> parameter, Amazon Rekognition
     * returns detailed facial attributes such as facial landmarks (for example, location of eye and mount) and other
     * facial attributes such gender. If you provide the same image, specify the same collection, and use the same
     * external ID in the <code>IndexFaces</code> operation, Amazon Rekognition doesn't save duplicate face metadata.
     * </p>
     * <p>
     * The input image is passed either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For an example, see <a>example2</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:IndexFaces</code> action.
     * </p>
     * 
     * @param indexFacesRequest
     * @return A Java Future containing the result of the IndexFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.IndexFaces
     */
    java.util.concurrent.Future<IndexFacesResult> indexFacesAsync(IndexFacesRequest indexFacesRequest);

    /**
     * <p>
     * Detects faces in the input image and adds them to the specified collection.
     * </p>
     * <p>
     * Amazon Rekognition does not save the actual faces detected. Instead, the underlying detection algorithm first
     * detects the faces in the input image, and for each face extracts facial features into a feature vector, and
     * stores it in the back-end database. Amazon Rekognition uses feature vectors when performing face match and search
     * operations using the and operations.
     * </p>
     * <p>
     * If you are using version 1.0 of the face detection model, <code>IndexFaces</code> indexes the 15 largest faces in
     * the input image. Later versions of the face detection model index the 100 largest faces in the input image. To
     * determine which version of the model you are using, check the the value of <code>FaceModelVersion</code> in the
     * response from <code>IndexFaces</code>. For more information, see <a>face-detection-model</a>.
     * </p>
     * <p>
     * If you provide the optional <code>ExternalImageID</code> for the input image you provided, Amazon Rekognition
     * associates this ID with all faces that it detects. When you call the operation, the response returns the external
     * ID. You can use this external image ID to create a client-side index to associate the faces with each image. You
     * can then use the index to find all faces in an image.
     * </p>
     * <p>
     * In response, the operation returns an array of metadata for all detected faces. This includes, the bounding box
     * of the detected face, confidence value (indicating the bounding box contains a face), a face ID assigned by the
     * service for each face that is detected and stored, and an image ID assigned by the service for the input image.
     * If you request all facial attributes (using the <code>detectionAttributes</code> parameter, Amazon Rekognition
     * returns detailed facial attributes such as facial landmarks (for example, location of eye and mount) and other
     * facial attributes such gender. If you provide the same image, specify the same collection, and use the same
     * external ID in the <code>IndexFaces</code> operation, Amazon Rekognition doesn't save duplicate face metadata.
     * </p>
     * <p>
     * The input image is passed either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For an example, see <a>example2</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:IndexFaces</code> action.
     * </p>
     * 
     * @param indexFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IndexFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.IndexFaces
     */
    java.util.concurrent.Future<IndexFacesResult> indexFacesAsync(IndexFacesRequest indexFacesRequest,
            com.amazonaws.handlers.AsyncHandler<IndexFacesRequest, IndexFacesResult> asyncHandler);

    /**
     * <p>
     * Returns list of collection IDs in your account. If the result is truncated, the response also provides a
     * <code>NextToken</code> that you can use in the subsequent request to fetch the next set of collection IDs.
     * </p>
     * <p>
     * For an example, see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListCollections</code> action.
     * </p>
     * 
     * @param listCollectionsRequest
     * @return A Java Future containing the result of the ListCollections operation returned by the service.
     * @sample AmazonRekognitionAsync.ListCollections
     */
    java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest listCollectionsRequest);

    /**
     * <p>
     * Returns list of collection IDs in your account. If the result is truncated, the response also provides a
     * <code>NextToken</code> that you can use in the subsequent request to fetch the next set of collection IDs.
     * </p>
     * <p>
     * For an example, see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListCollections</code> action.
     * </p>
     * 
     * @param listCollectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCollections operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.ListCollections
     */
    java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest listCollectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCollectionsRequest, ListCollectionsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding
     * box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see
     * <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListFaces</code> action.
     * </p>
     * 
     * @param listFacesRequest
     * @return A Java Future containing the result of the ListFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.ListFaces
     */
    java.util.concurrent.Future<ListFacesResult> listFacesAsync(ListFacesRequest listFacesRequest);

    /**
     * <p>
     * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding
     * box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see
     * <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListFaces</code> action.
     * </p>
     * 
     * @param listFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.ListFaces
     */
    java.util.concurrent.Future<ListFacesResult> listFacesAsync(ListFacesRequest listFacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFacesRequest, ListFacesResult> asyncHandler);

    /**
     * <p>
     * Returns an array of celebrities recognized in the input image. For more information, see
     * <a>celebrity-recognition</a>.
     * </p>
     * <p>
     * <code>RecognizeCelebrities</code> returns the 100 largest faces in the image. It lists recognized celebrities in
     * the <code>CelebrityFaces</code> array and unrecognized faces in the <code>UnrecognizedFaces</code> array.
     * <code>RecognizeCelebrities</code> doesn't return celebrities whose faces are not amongst the largest 100 faces in
     * the image.
     * </p>
     * <p>
     * For each celebrity recognized, the <code>RecognizeCelebrities</code> returns a <code>Celebrity</code> object. The
     * <code>Celebrity</code> object contains the celebrity name, ID, URL links to additional information, match
     * confidence, and a <code>ComparedFace</code> object that you can use to locate the celebrity's face on the image.
     * </p>
     * <p>
     * Rekognition does not retain information about which images a celebrity has been recognized in. Your application
     * must store this information and use the <code>Celebrity</code> ID property as a unique identifier for the
     * celebrity. If you don't store the celebrity name or additional information URLs returned by
     * <code>RecognizeCelebrities</code>, you will need the ID to identify the celebrity in a call to the operation.
     * </p>
     * <p>
     * You pass the imput image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For an example, see <a>recognize-celebrities-tutorial</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:RecognizeCelebrities</code> operation.
     * </p>
     * 
     * @param recognizeCelebritiesRequest
     * @return A Java Future containing the result of the RecognizeCelebrities operation returned by the service.
     * @sample AmazonRekognitionAsync.RecognizeCelebrities
     */
    java.util.concurrent.Future<RecognizeCelebritiesResult> recognizeCelebritiesAsync(RecognizeCelebritiesRequest recognizeCelebritiesRequest);

    /**
     * <p>
     * Returns an array of celebrities recognized in the input image. For more information, see
     * <a>celebrity-recognition</a>.
     * </p>
     * <p>
     * <code>RecognizeCelebrities</code> returns the 100 largest faces in the image. It lists recognized celebrities in
     * the <code>CelebrityFaces</code> array and unrecognized faces in the <code>UnrecognizedFaces</code> array.
     * <code>RecognizeCelebrities</code> doesn't return celebrities whose faces are not amongst the largest 100 faces in
     * the image.
     * </p>
     * <p>
     * For each celebrity recognized, the <code>RecognizeCelebrities</code> returns a <code>Celebrity</code> object. The
     * <code>Celebrity</code> object contains the celebrity name, ID, URL links to additional information, match
     * confidence, and a <code>ComparedFace</code> object that you can use to locate the celebrity's face on the image.
     * </p>
     * <p>
     * Rekognition does not retain information about which images a celebrity has been recognized in. Your application
     * must store this information and use the <code>Celebrity</code> ID property as a unique identifier for the
     * celebrity. If you don't store the celebrity name or additional information URLs returned by
     * <code>RecognizeCelebrities</code>, you will need the ID to identify the celebrity in a call to the operation.
     * </p>
     * <p>
     * You pass the imput image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For an example, see <a>recognize-celebrities-tutorial</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:RecognizeCelebrities</code> operation.
     * </p>
     * 
     * @param recognizeCelebritiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RecognizeCelebrities operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.RecognizeCelebrities
     */
    java.util.concurrent.Future<RecognizeCelebritiesResult> recognizeCelebritiesAsync(RecognizeCelebritiesRequest recognizeCelebritiesRequest,
            com.amazonaws.handlers.AsyncHandler<RecognizeCelebritiesRequest, RecognizeCelebritiesResult> asyncHandler);

    /**
     * <p>
     * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID
     * when you add a face to the collection using the <a>IndexFaces</a> operation. The operation compares the features
     * of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * You can also search faces without indexing faces by using the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * The operation response returns an array of faces that match, ordered by similarity score with the highest
     * similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the
     * metadata, the response also includes a <code>confidence</code> value for each face match, indicating the
     * confidence that the specific face matches the input face.
     * </p>
     * <p>
     * For an example, see <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFaces</code> action.
     * </p>
     * 
     * @param searchFacesRequest
     * @return A Java Future containing the result of the SearchFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.SearchFaces
     */
    java.util.concurrent.Future<SearchFacesResult> searchFacesAsync(SearchFacesRequest searchFacesRequest);

    /**
     * <p>
     * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID
     * when you add a face to the collection using the <a>IndexFaces</a> operation. The operation compares the features
     * of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * You can also search faces without indexing faces by using the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * The operation response returns an array of faces that match, ordered by similarity score with the highest
     * similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the
     * metadata, the response also includes a <code>confidence</code> value for each face match, indicating the
     * confidence that the specific face matches the input face.
     * </p>
     * <p>
     * For an example, see <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFaces</code> action.
     * </p>
     * 
     * @param searchFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.SearchFaces
     */
    java.util.concurrent.Future<SearchFacesResult> searchFacesAsync(SearchFacesRequest searchFacesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchFacesRequest, SearchFacesResult> asyncHandler);

    /**
     * <p>
     * For a given input image, first detects the largest face in the image, and then searches the specified collection
     * for matching faces. The operation compares the features of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * To search for all faces in an input image, you might first call the operation, and then use the face IDs returned
     * in subsequent calls to the operation.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> operation and use the bounding boxes in the response to make face
     * crops, which then you can pass in to the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * The response returns an array of faces that match, ordered by similarity score with the highest similarity first.
     * More specifically, it is an array of metadata for each face match found. Along with the metadata, the response
     * also includes a <code>similarity</code> indicating how similar the face is to the input face. In the response,
     * the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the
     * face that Amazon Rekognition used for the input image.
     * </p>
     * <p>
     * For an example, see <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFacesByImage</code> action.
     * </p>
     * 
     * @param searchFacesByImageRequest
     * @return A Java Future containing the result of the SearchFacesByImage operation returned by the service.
     * @sample AmazonRekognitionAsync.SearchFacesByImage
     */
    java.util.concurrent.Future<SearchFacesByImageResult> searchFacesByImageAsync(SearchFacesByImageRequest searchFacesByImageRequest);

    /**
     * <p>
     * For a given input image, first detects the largest face in the image, and then searches the specified collection
     * for matching faces. The operation compares the features of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * To search for all faces in an input image, you might first call the operation, and then use the face IDs returned
     * in subsequent calls to the operation.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> operation and use the bounding boxes in the response to make face
     * crops, which then you can pass in to the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the Amazon CLI to call Amazon Rekognition operations, passing image bytes is not supported.
     * The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * The response returns an array of faces that match, ordered by similarity score with the highest similarity first.
     * More specifically, it is an array of metadata for each face match found. Along with the metadata, the response
     * also includes a <code>similarity</code> indicating how similar the face is to the input face. In the response,
     * the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the
     * face that Amazon Rekognition used for the input image.
     * </p>
     * <p>
     * For an example, see <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFacesByImage</code> action.
     * </p>
     * 
     * @param searchFacesByImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchFacesByImage operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.SearchFacesByImage
     */
    java.util.concurrent.Future<SearchFacesByImageResult> searchFacesByImageAsync(SearchFacesByImageRequest searchFacesByImageRequest,
            com.amazonaws.handlers.AsyncHandler<SearchFacesByImageRequest, SearchFacesByImageResult> asyncHandler);

}
