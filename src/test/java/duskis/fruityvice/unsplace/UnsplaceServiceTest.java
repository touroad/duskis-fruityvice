package duskis.fruityvice.unsplace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import io.reactivex.rxjava3.core.Single;

class UnsplaceServiceTest {

    @Test
    void search() {
        //Given
        UnsplaceService service = new UnsplaceFactory().create();
        
        //When
        Photos photos = service.search("Strawberry").blockingGet();

        //Then
        assertNotNull(photos.results[0].urls().small());
    }
}