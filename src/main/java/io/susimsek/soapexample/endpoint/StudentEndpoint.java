package io.susimsek.soapexample.endpoint;

import io.susimsek.soapexample.domain.StudentDetailsRequest;
import io.susimsek.soapexample.domain.StudentDetailsResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Endpoint
public class StudentEndpoint {

	static final String NAMESPACE_URI = "http://www.howtodoinjava.com/xml/school";

	final io.susimsek.soapexample.repository.StudentRepository StudentRepository;


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
	@ResponsePayload
	public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) {
		StudentDetailsResponse response = new StudentDetailsResponse();
		response.setStudent(StudentRepository.findStudent(request.getName()));

		return response;
	}
}