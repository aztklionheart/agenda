package org.joinfaces.example.client;

import java.util.List;

import org.joinfaces.example.dto.AreaDTO;


//@FeignClient(name="area", url="https://agenda-208107.appspot.com/")
public interface AreaClient {

	//@RequestMapping(method = RequestMethod.GET, value = "/posts")
	List<AreaDTO> getAll();
	
}
