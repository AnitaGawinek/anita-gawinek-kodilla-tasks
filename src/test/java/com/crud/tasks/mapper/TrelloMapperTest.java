package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TrelloMapperTest {

    @InjectMocks
    private TrelloMapper trelloMapper;

    @Test
    public void TestMapToBoards() {
        // Given
        List<TrelloBoardDto> trelloBoardDtoList = new ArrayList<>();
        trelloBoardDtoList.add(new TrelloBoardDto("Test name", "Test id", new ArrayList<>()));

        // When
       List<TrelloBoard> mappedList = trelloMapper.mapToBoards(trelloBoardDtoList);

        // Then
        assertEquals(1, mappedList.size());
    }

    @Test
    public void TestMapToBoardsDto() {
        // Given
        List<TrelloBoard> trelloBoardList = new ArrayList<>();
        trelloBoardList.add(new TrelloBoard("Test id", "Test name", new ArrayList<>()));

        // When
        List<TrelloBoardDto> mappedList = trelloMapper.mapToBoardsDto(trelloBoardList);

        // Then
        assertEquals(1, mappedList.size());
    }

    @Test
    public void TestMapToList() {
        // Given
        List<TrelloListDto> trelloListDtoList = new ArrayList<>();
        trelloListDtoList.add(new TrelloListDto("Test id", "Test name", false));

        // When
        List<TrelloList> mappedList = trelloMapper.mapToList(trelloListDtoList);

        // Then
        assertEquals(1, mappedList.size());
    }

    @Test
    public void TestMapToListDto() {
        // Given
        List<TrelloList> trelloList = new ArrayList<>();
        trelloList.add(new TrelloList("Test id", "Test name", false));

        // When
        List<TrelloListDto> mappedList = trelloMapper.mapToListDto(trelloList);

        // Then
        assertEquals(1, mappedList.size());
    }

    @Test
    public void TestMapToCard() {
        // Given
        TrelloCardDto trelloCardDto = new TrelloCardDto("Test name", "Test description",
                "Test pos", "Test list id");

        // When
        TrelloCard trelloCard = trelloMapper.mapToCard(trelloCardDto);

        // Then
        assertEquals("Test name", trelloCard.getName());
        assertEquals("Test description", trelloCard.getDescription());
        assertEquals("Test pos", trelloCard.getPos());
        assertEquals("Test list id", trelloCard.getListId());
    }

    @Test
    public void TestMapToCardDto() {
        // Given
        TrelloCard trelloCard = new TrelloCard("Test name", "Test description",
                "Test pos", "Test list id");

        // When
        TrelloCardDto trelloCardDto = trelloMapper.mapToCardDto(trelloCard);

        // Then
        assertEquals("Test name", trelloCardDto.getName());
        assertEquals("Test description", trelloCardDto.getDescription());
        assertEquals("Test pos", trelloCardDto.getPos());
        assertEquals("Test list id", trelloCardDto.getListId());
    }
}