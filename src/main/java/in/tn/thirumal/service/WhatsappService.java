/**
 * 
 */
package in.tn.thirumal.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.tn.thirumal.model.Group;


/**
 * @author Thirumal
 *
 */
@Service
public class WhatsappService {

	Logger logger = LoggerFactory.getLogger(WhatsappService.class);
	
	private static String URL = "http://54.254.232.208:8080/whatsapp/internal/";
	
	public String createGroup(Group group) {
		logger.info("Create Group: " + group);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
	    HttpEntity<Group> requestEntity = new HttpEntity<Group>(group, headers);
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.postForObject(URL, requestEntity, String.class);
	    logger.info("Result: " + result);
	    return result;
	}
	
}
